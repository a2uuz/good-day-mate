public static void main(String... args) {
        System.out.println("Hello World");
    }
 
    static {
        try {
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello World", value.get("G'Day Mate."));
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }