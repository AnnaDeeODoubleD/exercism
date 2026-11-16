class SqueakyClean {
    static String clean(String identifier) {
        // Task 1: Replace spaces with underscores
        // Task 3: Convert leetspeak to normal text
        identifier = identifier
                .replace(' ', '_')
                .replace('4', 'a')
                .replace('3', 'e')
                .replace('0', 'o')
                .replace('1', 'l')
                .replace('7', 't');

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);

            // Task 2: Convert kebab-case to camelCase
            if (c == '-') {
                capitalizeNext = true;
            } else if (Character.isLetter(c) || c == '_') {
                // Task 4: Omit characters that aren't letters (keeping underscores)
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}