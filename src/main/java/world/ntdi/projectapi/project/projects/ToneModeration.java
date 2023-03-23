package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class ToneModeration extends Project {
    public ToneModeration() {
        super(14, "Tone Moderation", "Tone Moderation is an AI powered discord bot made in Python to understand the tone of a message, if the message is targeted or abusive, the bot deletes it. This allows for light, playful swearing that isn't targeted but more of a reaction. Language is beautiful and it shouldn't all be censored to due one meaning of a word.",
                List.of(
                        new SubSection("Backstory", "I was taking a summer camp about AI and neural networks. The camp was way to beginner for me and so I decided to spend my time working on a huge project that could be used by anyone. The whole point of this discord bot is to provide and moderated, but not limiting language use, because words have their own meaning. This bot is better than just a word filter because if you would want to allow light swearing, e.g. reactions to information, but not targeted harassment. This makes Tone Moderation perfect.")
                ), List.of(
                        "Discord moderation",
                        "Configurable",
                        "AI powered",
                        "Easy to use"
                ),"https://github.com/n-tdi/Tone-Moderation");
    }
}
