package scheme;

import arc.struct.Seq;
import scheme.dialogs.*;
import scheme.moded.ModedSchematics;

public class SchemeVars {
    public static ModedSchematics m_schematics;

    public static SchemasDialog schemas;

    public static void load() {
        schemas = new SchemasDialog();
    }
}
