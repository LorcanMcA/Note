public class ScreenObj extends Screen{

    private ScreenObjType _type;
    private SizeAndPos _Size_Loc;

    public ScreenObj (){
        _type = ScreenObjType.Text;
        _Size_Loc = new SizeAndPos();
    }

    public ScreenObj(ScreenObjType type, SizeAndPos pos){
        _type = type;
        _Size_Loc = pos;
    }

    @Override
    public String toString() {
        String s = "Type : "+_type+"\t"+_Size_Loc.getPos();

        return super.toString();
    }
}
