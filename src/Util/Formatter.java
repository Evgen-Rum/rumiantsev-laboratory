package Util;

public class Formatter {
    private static final String NEW_LINE = "\n";
    private static final String REGEX_TWO_OR_MORE_BLANK_LINES = NEW_LINE + "{3,}";
    private static final String REGEX_WHITESPACE_BEFORE_PUNCT_MARK = "([.,:;?!'])";
    private static final String REGEX_ONE_OR_MORE_WHITESPACE = "\\s+";
    private static final String BLANK_LINE = NEW_LINE + NEW_LINE;

    public static String[] divideToParagraphs (String text) {
        return text.split(REGEX_TWO_OR_MORE_BLANK_LINES);
    }

    public static String insertIndentation(String paragraph, int indentationLengths) {
        String indentation = "";
        for(int i = 0; i < indentationLengths; i++) {
            indentation += " ";
        }
        return indentation + paragraph;
    }

    public static String formatWhiteSpaces(String text) {
        text = text.replaceAll(REGEX_ONE_OR_MORE_WHITESPACE, " ");
        text = text.trim();
        text = text.replaceAll(REGEX_WHITESPACE_BEFORE_PUNCT_MARK, "$1");
        return text;
    }

    public static String formatLineLength(String text, int maxLength) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for(int i = maxLength; i < text.length(); i += maxLength) {
            while (text.charAt(i) != ' ') {
                i--;
            }
            stringBuilder.replace(i, i + 1, NEW_LINE);
        }
        return stringBuilder.toString();
    }

    public static String formatText(String text, int indentationLength, int maxLineLength) {
        String[] paragraphs = divideToParagraphs(text);
        StringBuilder formattedText = new StringBuilder();
        for(int i = 0; i < paragraphs.length; i++) {
            paragraphs[i] = formatWhiteSpaces(paragraphs[i]);
            paragraphs[i] = insertIndentation(paragraphs[i], indentationLength);
            paragraphs[i] = formatLineLength(paragraphs[i], maxLineLength);
            formattedText.append(paragraphs[i]).append(BLANK_LINE);
        }
        return formattedText.toString();
    }
}
