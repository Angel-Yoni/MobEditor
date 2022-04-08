# MobEditor
- This plugin was made by TheHandsomeYoni with the help of _ItsAngel_
- MobEditor is a Spigot plugin, which currently supports only 1.18. 
- Using this plugin, you can edit mob's features and properties.
- MobEditor is fully configurable, easy and free to use.

![](https://img.shields.io/github/v/release/Angel-Yoni/MobEditor.svg)


# Features
- Edit mob's nickname - 🔤
- Edit mob's armor and main item - 👕 🗡️
- Custom items support 
- Enable mob's invincibity (Immortallity) - ☢️
- Target a player (In progress) - 🔜
- AI (Controls if the mob will move) - 🤖
- Max health - ❤️
- Attack damage - 🦾
- Movement speed - ⚡
- Damage absorbsion - 🛡️

# Configuration
This plugin is fully configurable. 
You can decide which material and name each function and feature will get, by easily editing **config.yml**.

***Example config.yml***

```
# Made by TheHandsomeYoni and _ItsAngel_


main-inventory-title: '&a&lMob Editor'
insert-item-inventory-title: '&a&lInsert Item'


mob-edit-section:
  equipment-helmet:
    name: '&aHelmet'
    material: DIAMOND_HELMET
    type: 'item'

  equipment-chestplate:
    name: '&aChestplate'
    material: DIAMOND_CHESTPLATE
    type: 'item'

  equipment-leggings:
    name: '&aLeggings'
    material: DIAMOND_LEGGINGS
    type: 'item'

  equipment-boots:
    name: '&aBoots'
    material: DIAMOND_BOOTS
    type: 'item'

  display-name:
    name: '&aName'
    material: PAPER
    type: 'string'

  invincibility:
    name: '&aInvincible'
    material: TOTEM_OF_UNDYING
    type: 'boolean'

  target-player:
    name: '&aTarget Player'
    material: COMPASS
    type: 'player'

  AI:
    name: '&aAI'
    material: LEGACY_EYE_OF_ENDER
    type: 'boolean'

  attribute-generic-armor:
    name: '&aProtection'
    material: IRON_CHESTPLATE
    type: 'GENERIC_ARMOR'

  attribute-generic-attack-damage:
    name: '&aDamage'
    material: REDSTONE
    type: 'GENERIC_ATTACK_DAMAGE'

  attribute-generic-movement-speed:
    name: '&aSpeed'
    material: FEATHER
    type: 'GENERIC_MOVEMENT_SPEED'

  attribute-generic-max-health:
    name: '&aHealth'
    material: ENCHANTED_GOLDEN_APPLE
    type: 'GENERIC_MAX_HEALTH'
```
