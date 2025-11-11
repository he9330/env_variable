package com.example.demo;

public class App {
    public static void main(String[] args) {
        String profile = System.getenv("PROFILE_NAME");
        if (profile == null || profile.isEmpty()) {
            System.out.println("❌ PROFILE_NAME environment variable is not set!");
            System.exit(1);
        } else {
            System.out.println("🚀 Application started with profile: " + profile);
        }
    }
}
