class main {
    public static void main(String[] args)
    {
        System.out.println("-main-");
        HashTable hash = new HashTable();
        
        hash.put("TEST");
        hash.put("Apple");

        hash.remove("TEST");
        hash.remove("TEST");
        hash.remove("Apple");
    }
}