package org.l13gr01.boxesWizard.model.game.arena;

import org.l13gr01.boxesWizard.model.game.elements.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoaderArenaBuilder extends ArenaBuilder {
    private final List<String> lines;
    private final List<Diamonds> diamonds = new ArrayList<>();
    @SuppressWarnings("DefaultCharset")
    public LoaderArenaBuilder(int level) throws IOException {
        try {
            URL resource = LoaderArenaBuilder.class.getResource("/levels/level" + level + ".lvl");
            BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));

            lines = readLines(br);
        }catch (NullPointerException e){
            throw new IOException("Level not found");
        }

    }

    private List<String> readLines(BufferedReader br) throws IOException {
        List<String> lines = new ArrayList<>();
        for (String line; (line = br.readLine()) != null; )
            lines.add(line);
        return lines;
    }

    @Override
    protected int getWidth() {
        int width = 0;
        for (String line : lines)
            width = Math.max(width, line.length());
        return width;
    }

    @Override
    protected int getHeight() {
        return lines.size();
    }

    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '#') walls.add(new Wall(x, y));
        }
        return walls;
    }

    @Override
    protected List<Diamonds> createDiamonds() {


        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'D') diamonds.add(new Diamonds(x, y));
        }
        return diamonds;
    }

    @Override
    protected Wizard createWizard() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'W') return new Wizard(x, y);
        }
    return null;
    }
    @Override
    protected List<Spikes> createSpikes() {
        List<Spikes> spikes = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'S') spikes.add(new Spikes(x, y));
        }
        return spikes;
    }

    @Override
    protected List<Boxes> createBoxes() {
        List<Boxes> boxes = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'B') boxes.add(new Boxes(x, y));
        }
        return boxes;
    }

    @Override
    protected Trophy createTrophy() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'T') return new Trophy(x, y);
        }
        return null;
    }
}
