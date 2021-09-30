package CustomList;

/**
 * node of singly connected list
 * @param <DataType> type of data
 */
public class Node <DataType>
{
    Node<DataType> next;
    DataType data;

    public Node(DataType _data)
    {
        data = _data;
        next = null;
    }

    /**
     * get data of the node
     * @return data
     */
    public DataType getData()
    {
        return data;
    }

    /**
     * get lint to the next node
     * @return link to the next node
     */
    public Node<DataType> getNext()
    {
        return next;
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
        Node<DataType> other = (Node<DataType>) obj;
        if(!this.data.equals(other.data) || !this.next.equals(other.next))
        {
            return false;
        }
        return true;
    }
    @Override
    public String toString()
    {
        return "Node{\ndata: " + data.toString() +"\n next: " + next.toString() + "}";
    }
}
