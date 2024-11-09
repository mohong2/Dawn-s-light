execute as @a[tag=doctor316] run effect give @a[tag=doctor316] minecraft:health_boost infinite 2 false
execute as @a[tag=doctor316] run effect give @a[tag=doctor316] minecraft:regeneration infinite 2 false


execute as @a[tag=police316] run effect give @a[tag=police316] minecraft:health_boost infinite 1 false
execute as @a[tag=police316] run effect give @a[tag=police316] minecraft:strength infinite 2 false


execute as @a[tag=hunter316] run effect give @a[tag=hunter316] minecraft:speed infinite 1 false
execute as @a[tag=hunter316] run effect give @a[tag=hunter316] minecraft:strength infinite 2 false


execute as @a[tag=labor316] run effect give @a[tag=labor316] minecraft:haste infinite 1 false
execute as @a[tag=labor316] run effect give @a[tag=labor316] minecraft:jump_boost infinite 2 false


execute as @a run effect give @a minecraft:glowing infinite 1 false

execute if entity @a run schedule function mohong:class_effects 600s
