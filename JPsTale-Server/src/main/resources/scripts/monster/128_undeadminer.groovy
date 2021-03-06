monster = [
	ID:'128_undeadminer',
	Name:'矿山开采者',
	Clazz:0,// 1 BOSS
	Brood:0x00,// 0 Normal; 0x90(144) UNDEAD; 0x91 MUTANT; 0x92 DEMON; 0x93 MECHANIC;
	// Common Status
	Level:128,
	ActiveHour:0,
	RespawnGroup:[1, 1],

	Attributes:[
		Life:16000,
		// Attack Status
		Atk:[263, 286],
		AtkSpeed:8,
		Range:80,
		Rating:2300,

		// Defence Status
		Flee:1500,
		Absorb:55,
		Block:30,
		DamageStunPers:100,

		// Resistance
		Earth:30,
		Fire:-80,
		Ice:80,// Water
		Lighting:10,// Wind
		Poison:100,
	],

	// AI
	AI:[
		Nature:0x82,// 0x80 NATURAL; 0x81 GOOD; 0x82 EVIL
		IQ:8,
		Real_Sight:320,
		Talks:[],

		// Move Behavier
		Move_Speed:3,
		MoveRange:64,

		// Skill Behavier
		SpAttackPercetage:30,
		SkillDamage:[296, 312],
		SkillDistance:0,
		SkillRange:110,
		SkillRating:30,
		SkillCurse:0,

		// Heal Behavier
		PotionPercent:0,
		PotionCount:0,
	],

	Looks:[
		ClassCode:0,
		ArrowPosi:[0, 0],
		ModelSize:0.0,
		UseEventModel:false,
		SizeLevel:1,
		Model:'char/monster/UndeadMiner/undeadminer.ini',
		Sound:0x00000000,
	],

	// Drops
	AllSeeItem:false,
	Exp:1625000,
	Quantity:2,
	drops:[
		[probability:1510, code:"NULL"/* Drops nothing */],
		[probability:2020, code:"GG101", value:[3650, 4050]/* Gold */],
		[probability:933, code:"PL104"/* 顶级恢复生命药水 */],
		[probability:933, code:"PS104"/* 顶级恢复耐力药水 */],
		[probability:933, code:"PM104"/* 顶级恢复魔法药水 */],
		[probability:83, code:"DA120"/* 炎龙圣铠 */],
		[probability:83, code:"DA220"/* 修罗圣衣 */],
		[probability:83, code:"WA118"/* 雷神斧 */],
		[probability:83, code:"WC118"/* 星刺爪 */],
		[probability:83, code:"WH119"/* 弑神 */],
		[probability:83, code:"WM119"/* 末日辉煌 */],
		[probability:83, code:"WP119"/* 棲羽亚陀 */],
		[probability:83, code:"WS120"/* 羽裂 */],
		[probability:83, code:"ws221"/* 32dew2 */],
		[probability:83, code:"WT119"/* 流星 */],
		[probability:83, code:"DB118"/* 符文之靴 */],
		[probability:83, code:"DS118"/* 死神之盾 */],
		[probability:83, code:"OM119"/* 赤魔之心 */],
		[probability:83, code:"DG118"/* 泰坦护手 */],
		[probability:83, code:"OA218"/* 泰坦臂环 */],
		[probability:83, code:"OR117"/* 封魔之戒 */],
		[probability:83, code:"OA117"/* 天眼护符 */],
		[probability:83, code:"OS109"/* 龙鳞石 */],
		[probability:52, code:"DA121"/* 魔龙圣铠 */],
		[probability:52, code:"DA221"/* 涅磐圣衣 */],
		[probability:52, code:"WA119"/* 幽月斧 */],
		[probability:52, code:"WC119"/* 修罗爪 */],
		[probability:52, code:"WH120"/* 无畏 */],
		[probability:52, code:"WM120"/* 灭绝 */],
		[probability:52, code:"WP120"/* 炎枪素戋鸣 */],
		[probability:52, code:"WS121"/* 亚罗栖 */],
		[probability:52, code:"WS222"/* 赤焰流星 */],
		[probability:52, code:"WT120"/* 天妒 */],
		[probability:52, code:"DB119"/* 死神战靴 */],
		[probability:52, code:"DS119"/* 蛮狮之盾 */],
		[probability:52, code:"OM120"/* 炫钻水晶 */],
		[probability:52, code:"DG119"/* 炫彩护手 */],
		[probability:52, code:"OA219"/* 兽神臂环 */],
		[probability:52, code:"OR118"/* 封神之戒 */],
		[probability:52, code:"OA118"/* 圣光勋章 */],
		[probability:52, code:"OS110"/* 钻晶石 */],
		[probability:33, code:"DA122"/* 炫金圣铠 */],
		[probability:33, code:"DA222"/* 雅典娜圣衣 */],
		[probability:33, code:"WA120"/* 米诺陶斯斧 */],
		[probability:33, code:"WC120"/* 寂灭龙爪 */],
		[probability:33, code:"WH121"/* 轰雷战锤 */],
		[probability:33, code:"WM121"/* 雅典娜之光 */],
		[probability:33, code:"WP121"/* 灵犀之镰 */],
		[probability:33, code:"WS123"/* 红羽 */],
		[probability:33, code:"WS223"/* 创世之剑 */],
		[probability:33, code:"WT121"/* 龙翔标枪 */],
		[probability:33, code:"DB120"/* 炫金战靴 */],
		[probability:33, code:"DS120"/* 炫金之盾 */],
		[probability:33, code:"OM121"/* 海洋之心 */],
		[probability:33, code:"DG120"/* 炫金护手 */],
		[probability:33, code:"OA220"/* 炫金臂环 */],
		[probability:33, code:"OR119"/* 轮回之戒 */],
		[probability:33, code:"OA119"/* 逆天纹章 */],
		[probability:33, code:"OS111"/* 龙睛石 */],
		[probability:17, code:"DA123"/* 凤凰圣铠 */],
		[probability:17, code:"DA223"/* 凤凰圣衣 */],
		[probability:17, code:"WA121"/* 苍红斧 */],
		[probability:17, code:"WC121"/* 灭牙爪 */],
		[probability:17, code:"WH122"/* 魁伐折罗 */],
		[probability:17, code:"WM122"/* 流泉月花 */],
		[probability:17, code:"WP122"/* 天之琼侔 */],
		[probability:17, code:"WS124"/* 天之麻迦古弓 */],
		[probability:17, code:"WS224"/* 暗牙黄泉津 */],
		[probability:17, code:"WT122"/* 暗破 */],
		[probability:17, code:"DB121"/* 凤凰战靴 */],
		[probability:17, code:"DS121"/* 凤凰之盾 */],
		[probability:17, code:"OM122"/* 恶魔法珠 */],
		[probability:17, code:"DG121"/* 凤凰护手 */],
		[probability:17, code:"OA221"/* 凤凰臂环 */],
		[probability:17, code:"OR120"/* 涅磐之戒 */],
		[probability:17, code:"OA120"/* 九转护符 */],
		[probability:17, code:"OS112"/* 圣晶石 */],
		[probability:13, code:"DA124"/* 奥丁圣铠 */],
		[probability:13, code:"DA224"/* 奥丁圣衣 */],
		[probability:13, code:"WA122"/* 龙炎斧 */],
		[probability:13, code:"WC122"/* 黑虹爪 */],
		[probability:13, code:"WH123"/* 大鎚伊武岐 */],
		[probability:13, code:"WM123"/* 螺钿三日星 */],
		[probability:13, code:"WP123"/* 卡厄斯 */],
		[probability:13, code:"WS125"/* 潘多拉之弓 */],
		[probability:13, code:"WS225"/* 32d22w */],
		[probability:13, code:"WT123"/* 天严云 */],
		[probability:13, code:"DB122"/* 奥丁战靴 */],
		[probability:13, code:"DS122"/* 奥丁之盾 */],
		[probability:13, code:"OM123"/* 紫金之光 */],
		[probability:13, code:"DG122"/* 奥丁护手 */],
		[probability:13, code:"OA222"/* 奥丁臂环 */],
		[probability:13, code:"OR121"/* 龙誉之戒 */],
		[probability:13, code:"OA121"/* 圣龙之光 */],
		[probability:13, code:"OS113"/* 恶魔石 */],
		[probability:3, code:"DA125"/* 汉兰达铠 */],
		[probability:3, code:"DA225"/* 天使圣衣 */],
		[probability:3, code:"WA123"/* 龙之破坏者 */],
		[probability:3, code:"WC123"/* 红蛛之牙 */],
		[probability:3, code:"WH124"/* 龙王之锤 */],
		[probability:3, code:"WM124"/* 双龙阿修罗 */],
		[probability:3, code:"WP124"/* 烈枪降阎魔 */],
		[probability:3, code:"WS226"/* 真龙神啸 */],
		[probability:3, code:"WT124"/* 皓月谙晓 */],
		[probability:3, code:"DB123"/* 圣龙之靴 */],
		[probability:3, code:"DS123"/* 地狱之盾 */],
		[probability:3, code:"OM124"/* 圣龙之光 */],
		[probability:3, code:"DG123"/* 圣龙护手 */],
		[probability:3, code:"OA223"/* 圣龙臂环 */],
		[probability:3, code:"OR122"/* 彩晶环 */],
		[probability:3, code:"OA122"/* 彩晶链 */],
		[probability:3, code:"OS114"/* 彩晶石 */]
	],
	drops_more:[
	]
]
