package scheme;

import mindustry.game.Schematics;
import mindustry.mod.Mod;
import scheme.moded.ModedSchematics;

import static arc.Core.*;
import static mindustry.Vars.*;
import static scheme.SchemeVars.*;

public class Main extends Mod {

    public Main() {
        // well, after the 136th build, it became much easier
        maxSchematicSize = 768;
        assets.load(schematics = m_schematics = new ModedSchematics());
        assets.unload(Schematics.class.getSimpleName()); // prevent dual loading
    }

    @Override
    public void init() {
        SchemeVars.load();

        ui.schematics = schemas;
        if (m_schematics.requiresDialog) ui.showOkText("@rename.name", "@rename.text", () -> {});
    }
}
