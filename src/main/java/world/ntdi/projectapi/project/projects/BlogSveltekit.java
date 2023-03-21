package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class BlogSveltekit extends Project {
    public BlogSveltekit() {
        super(8, "Blog SvelteKit", "A MarkDown based blog site made in SvelteKit",
                List.of(
                        new SubSection("Converting Markdown to Posts", "With the mdsvex plugin for svelte, I was able to store markdown files with special attributes in their headers. This allows me to create features of sorting based on tags, time, or author (even though I was the only author)."),
                        new SubSection("Old SvelteKit", "I wrote this program a long time ago, and with Svelte/Kit being a ever-changing framework, the code is incredibly outdated, I am amazed that it even works in minor versions after it. Either way, this project is meant to be a demonstration.")
                ),
                List.of(
                        "Local MD storage with no external API",
                        "Conversion of MD to HTML",
                        "Sorting based on Blog Attributes"
                ),
                new Preview("Blog SvelteKit", "A MarkDown based blog site made in SvelteKit", "https://github.com/n-tdi/blog-sveltekit"));
    }
}
