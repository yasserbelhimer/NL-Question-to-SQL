package SDM;
public class Level {
    private String name;
    private String column;
    private String leftKey;
    private String rightKey;

    public Level(String name,String column,String leftKey,String rightKey){
        this.name       = name;
        this.column     = column;
        this.leftKey    = leftKey;
        this.rightKey   = rightKey;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColumn() {
        return this.column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getLeftKey() {
        return this.leftKey;
    }

    public void setLeftKey(String leftKey) {
        this.leftKey = leftKey;
    }

    public String getRightKey() {
        return this.rightKey;
    }

    public void setRightKey(String rightKey) {
        this.rightKey = rightKey;
    }

}