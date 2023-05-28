{ pkgs }: {
    deps = [
        pkgs.unixtools.nettools
        pkgs.neofetch
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}