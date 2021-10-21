package CustomList;

import javax.xml.crypto.Data;

/**
 * singly linked list
 * @param <DataType> type of data
 */
public class List<DataType>
{
    int size;
    Node<DataType> head;

    public List()
    {
        head = null;
        size = 0;
    }

    /**
     * Get link to the head
     * @return link to the head
     */
    public Node<DataType> getHead()
    {
        return head;
    }

    /**
     * Get size of list
     * @return size
     */
    public int getSize()
    {
        return size;
    }

    /**
     * check for empty list
     * @return is list empty?
     */
    public boolean isEmpty()
    {
        return size == 0;
    }

    /**
     * Add elem to the beginning of the list
     * @param elem Insert elem
     */
    public void addToHead(DataType elem)
    {
        Node<DataType> insert = new Node<DataType>(elem);
        insert.next = head;
        head = insert;
        size++;
    }

    /**
     * Add elem to the end of the list
     * @param elem Insert elem
     */
    public void addToTail(DataType elem)
    {
        if (isEmpty())
        {
            head = new Node<DataType>(elem);
        }
        else
        {
            Node<DataType> temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new Node<DataType>(elem);
        }
        size++;
    }

    /**
     * Add elem to position in the list
     * @param elem Insert elem
     * @param index Position
     * @throws Exception If trying to add an elem outside of the list
     */
    public void addTo(DataType elem, int index) throws Exception
    {
        if (index > size || index < 0)
        {
            throw new Exception("Out of range");
        }
        else if (index == 0)
        {
            addToHead(elem);
        }
        else
        {
            Node<DataType> temp = head;
            for (int i = 0; i < index - 1; i++)
            {
                temp = temp.next;
            }
            Node<DataType> temp1 = temp.next;
            Node<DataType> newNode = new Node<DataType>(elem);
            temp.next = newNode;
            newNode.next = temp1;
            size++;
        }
    }

    /**
     * Delete elem from the end of the list
     * @throws Exception If trying to delete an elem of empty list
     */
    public void deleteFromHead() throws Exception
    {
//        if (isEmpty())
//        {
//            throw new Exception("List is empty");
//        }
//        else
//        {
//            head = head.next;
//            size--;
//        }
        popFromHead();
    }

    /**
     * Delete elem from the end of the list
     * @throws Exception If trying to delete an elem of empty list
     */
    public void deleteFromTail() throws Exception
    {
//        if (isEmpty())
//        {
//            throw new Exception("List is empty");
//        }
//        else if (size == 1)
//        {
//            deleteFromHead();
//        }
//        else
//        {
//            Node<DataType> temp = head;
//            while (temp.next.next != null)
//            {
//                temp = temp.next;
//            }
//            temp.next = null;
//            size--;
//        }
        popFromTail();
    }

    /**
     * Delete elem from position in the list
     * @param index position
     * @throws Exception If trying to delete an elem outside of the list
     */
    public void deleteFrom(int index) throws Exception
    {
//        if (index >= size || index < 0) {
//            throw new Exception("Out of range");
//        } else if (index == 0) {
//            deleteFromHead();
//        } else {
//            Node<DataType> temp = head;
//            for (int i = 0; i < index - 1; i++) {
//                temp = temp.next;
//            }
//            Node<DataType> delNode = temp.next;
//            temp.next = delNode.next;
//            delNode.next = null;
//            size--;
//        }
        popFrom(index);
    }

    /**
     * Extract elem from the beginning of the list
     * @return extracted elem
     * @throws Exception If trying to extract an elem of empty list
     */
    public DataType popFromHead() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("List is empty");
        }
        DataType elem = head.data;
        head = head.next;
        size--;
        return elem;
    }

    /**
     * Extract elem from the end of the list
     * @return extracted elem
     * @throws Exception If trying to extract an elem of empty list
     */
    public DataType popFromTail() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("List is empty");
        }
        DataType elem = null;
        if (size == 1)
        {
            deleteFromHead();
        }
        else
        {
            Node<DataType> temp = head;
            while (temp.next.next != null)
            {
                temp = temp.next;
            }
            elem = temp.next.data;
            temp.next = null;
            size--;
        }
        return elem;
    }

    /**
     * Extract elem from position in the list
     * @param index position
     * @return extracted elem
     * @throws Exception If trying to extract an elem outside of the list
     */
    public DataType popFrom(int index) throws Exception
    {
        if (index >= size)
        {
            throw new Exception("Out of range");
        }
        DataType elem = null;
        if (index == 0)
        {
            deleteFromHead();
        }
        else
        {
            Node<DataType> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<DataType> delNode = temp.next;
            elem = delNode.data;
            temp.next = delNode.next;
            delNode.next = null;
            size--;
        }
        return elem;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        List<DataType> other = (List<DataType>) obj;
        if(this.size != other.size)
        {
            return false;
        }
        Node<DataType> tempMine = head;
        Node<DataType> tempOther = other.head;
        while(head != null)
        {
            if(!tempMine.equals(tempOther))
            {
                return false;
            }
            tempMine = tempMine.next;
            tempOther = tempOther.next;
        }
        return true;
    }
    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder("");

        Node<DataType> temp = head;
        while(temp != null)
        {
            str.append(temp.data.toString()).append("; ");
            temp = temp.next;
        }
        return "size: " + size +"\nlist: " + str + "";
    }
}
