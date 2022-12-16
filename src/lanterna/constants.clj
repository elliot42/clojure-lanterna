(ns lanterna.constants
  (:import java.nio.charset.Charset
           com.googlecode.lanterna.screen.Screen
           com.googlecode.lanterna.terminal.Terminal
           com.googlecode.lanterna.terminal.swing.TerminalEmulatorPalette
           com.googlecode.lanterna.TextColor$ANSI
           com.googlecode.lanterna.SGR
           com.googlecode.lanterna.input.KeyType))


(def charsets {:utf-8 (Charset/forName "UTF-8")})

(def colors
  {:black   com.googlecode.lanterna.TextColor$ANSI/BLACK
   :white   com.googlecode.lanterna.TextColor$ANSI/WHITE
   :red     com.googlecode.lanterna.TextColor$ANSI/RED
   :green   com.googlecode.lanterna.TextColor$ANSI/GREEN
   :blue    com.googlecode.lanterna.TextColor$ANSI/BLUE
   :cyan    com.googlecode.lanterna.TextColor$ANSI/CYAN
   :magenta com.googlecode.lanterna.TextColor$ANSI/MAGENTA
   :yellow  com.googlecode.lanterna.TextColor$ANSI/YELLOW
   :default com.googlecode.lanterna.TextColor$ANSI/DEFAULT})

(def styles
  {:bold SGR/BOLD
   :reverse SGR/REVERSE
   :underline SGR/UNDERLINE
   :blinking SGR/BLINK})

(def key-codes
  {com.googlecode.lanterna.input.KeyType/Escape :escape
   com.googlecode.lanterna.input.KeyType/Backspace :backspace
   com.googlecode.lanterna.input.KeyType/ArrowLeft :left
   com.googlecode.lanterna.input.KeyType/ArrowRight :right
   com.googlecode.lanterna.input.KeyType/ArrowUp :up
   com.googlecode.lanterna.input.KeyType/ArrowDown :down
   com.googlecode.lanterna.input.KeyType/Insert :insert
   com.googlecode.lanterna.input.KeyType/Delete :delete
   com.googlecode.lanterna.input.KeyType/Home :home
   com.googlecode.lanterna.input.KeyType/End :end
   com.googlecode.lanterna.input.KeyType/PageUp :page-up
   com.googlecode.lanterna.input.KeyType/PageDown :page-down
   com.googlecode.lanterna.input.KeyType/Tab :tab
   com.googlecode.lanterna.input.KeyType/ReverseTab :reverse-tab
   com.googlecode.lanterna.input.KeyType/Enter :enter
   com.googlecode.lanterna.input.KeyType/Unknown :unknown
   com.googlecode.lanterna.input.KeyType/CursorLocation :cursor-location})


(def palettes
  {:gnome      TerminalEmulatorPalette/GNOME_TERMINAL
   :vga        TerminalEmulatorPalette/STANDARD_VGA
   :windows-xp TerminalEmulatorPalette/WINDOWS_XP_COMMAND_PROMPT
   :mac-os-x   TerminalEmulatorPalette/MAC_OS_X_TERMINAL_APP
   :xterm      TerminalEmulatorPalette/PUTTY
   :putty      TerminalEmulatorPalette/XTERM})
