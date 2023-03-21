package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class NumberToRomanNumerals extends Project {
    public NumberToRomanNumerals() {
        super(19, "Number to Roman Numerals", "Written in pure Rust, Number to Roman Numerals is a Cargo library to convert numbers into their Roman Numeral equivalent",
                List.of(
                        new SubSection("How?", "Using Math and iterable loops, converting a number to roman numerals is super easy.")
                ), List.of(
                        "Cargo Library",
                        "Pure Rust",
                        "Open Source",
                        "Light Weight"
                ), new Preview("Number to Roman Numerals", "Written in pure Rust, Number to Roman Numerals is a Cargo library to convert numbers into their Roman Numeral equivalent", "https://github.com/n-tdi/Number-to-Roman-Numerals"));
    }
}
