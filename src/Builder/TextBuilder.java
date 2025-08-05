package Builder;

public class TextBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("=== ").append(title).append(" ===\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("■ ").append(str).append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            sb.append("  - ").append(item).append("\n");
        }
    }

    public void close() {
        sb.append("==========\n");
    }

    public String getTextResult() {
        return sb.toString();
    }
}
