public class SimpleHashtable
{
    private StoredStudent[] hashtable;

    public SimpleHashtable(int capacity)
    {
        hashtable = new StoredStudent[capacity];
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }


    public void put(String key, Student value)
    {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey))
        {
            System.out.println("\nSorry, there's already an element at position " + hashedKey);
            System.out.println("Starting Linear Probing");
            // Linear probing
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                System.out.println("Current Hashkey: " + hashedKey + " is occupied");
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        hashtable[hashedKey] = new StoredStudent(key, value);
        System.out.println("value put at index: " + hashedKey + "\n");
    }

    public Student get(String key)
    {
        int hashedKey = findKey(key);
        if(hashedKey == -1)
        {
            System.out.println("Wasn't able to find the key: " + key);
            return null;
        }

        return hashtable[hashedKey].value;
    }

    public void remove(String key)
    {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            System.out.println("Wasn't able to find the key: " + key);
        } else {
            hashtable[hashedKey] = null;
            System.out.println("Key " + key + " removed from index " + hashedKey);
        }
    }

    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            System.out.println("Element " + i + ": " + hashtable[i]);
        }
    }

    private int findKey(String key)
    {
        int hashedKey = hashKey(key);

        if(isOccupied(hashedKey) && isSameKey(hashedKey, key))
        {
            return hashedKey;
        }
        else
        {
            System.out.println("\nSorry, the key in index " + hashedKey + "(" + hashtable[hashedKey].key + ") is not the same as " + key);
            System.out.println("Starting Linear Probing");
            // Linear probing
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }

            while (!isSameKey(hashedKey, key) && hashedKey != stoppingIndex)
            {
                System.out.println("Current key in index " + hashedKey + "(" + hashtable[hashedKey].key + ") is not the same as " + key);
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if(isOccupied(hashedKey) && isSameKey(hashedKey, key))
        {
            return hashedKey;
        }

        return -1;
    }

    private boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    private boolean isSameKey(int index, String key)
    {
        return hashtable[index].key.equals(key);
    }
}
