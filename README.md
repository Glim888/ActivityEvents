# Foobar

Foobar is a Python library for dealing with word pluralization.

## Installation

1. Download this extension.
2. In GameMakerStudio2 under extension -> rightclick AddExisting -> choose downloaded file -> done



## Usage

```cpp
// Async (Social)
if (ds_exists(async_load, ds_type_map)) {
	var _activity = ds_map_find_value(async_load, "activity");
	
	if (is_undefined(_activity)) return;
	
    if (_activity == "onResume") { // gets called when user resume game}
    if (_activity == "onRestart") { // gets called when app restarts}
    if (_activity == "onStart") { // gets called at startup}
    if (_activity == "onPause") {  // gets called at pause}
    if (_activity == "onStop") {  // gets called at end}
}
```

