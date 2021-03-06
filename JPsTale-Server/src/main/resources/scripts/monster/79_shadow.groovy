monster = [
	ID:'79_shadow',
	Name:'鬼影杀手',
	Clazz:0,// 1 BOSS
	Brood:0x92,// 0 Normal; 0x90(144) UNDEAD; 0x91 MUTANT; 0x92 DEMON; 0x93 MECHANIC;
	// Common Status
	Level:79,
	ActiveHour:0,
	RespawnGroup:[0, 0],

	Attributes:[
		Life:2400,
		// Attack Status
		Atk:[48, 56],
		AtkSpeed:7,
		Range:160,
		Rating:1050,

		// Defence Status
		Flee:600,
		Absorb:16,
		Block:8,
		DamageStunPers:100,

		// Resistance
		Earth:35,
		Fire:30,
		Ice:20,// Water
		Lighting:10,// Wind
		Poison:30,
	],

	// AI
	AI:[
		Nature:0x82,// 0x80 NATURAL; 0x81 GOOD; 0x82 EVIL
		IQ:8,
		Real_Sight:410,
		Talks:[],

		// Move Behavier
		Move_Speed:4,
		MoveRange:64,

		// Skill Behavier
		SpAttackPercetage:20,
		SkillDamage:[0, 0],
		SkillDistance:0,
		SkillRange:0,
		SkillRating:0,
		SkillCurse:0,

		// Heal Behavier
		PotionPercent:0,
		PotionCount:0,
	],

	Looks:[
		ClassCode:0,
		ArrowPosi:[0, 30],
		ModelSize:0.0,
		UseEventModel:false,
		SizeLevel:-1,
		Model:'char/monster/Monshadow/Monshadow.ini',
		Sound:0x000012E0,
	],

	// Drops
	AllSeeItem:false,
	Exp:30500,
	Quantity:1,
	drops:[
		[probability:1650, code:"NULL"/* Drops nothing */],
		[probability:4000, code:"GG101", value:[200, 280]/* Gold */],
		[probability:666, code:"PL104"/* 顶级恢复生命药水 */],
		[probability:666, code:"PL104"/* 顶级恢复生命药水 */],
		[probability:666, code:"PM104"/* 顶级恢复魔法药水 */],
		[probability:70, code:"DA109"/* 黄铜战铠 */],
		[probability:70, code:"DA209"/* 学徒披风 */],
		[probability:70, code:"WA108"/* 叼刚 清磐 */],
		[probability:70, code:"WC108"/* 矩记飘 府亥瘤 */],
		[probability:70, code:"WH109"/* 固萍绢扼捞飘 */],
		[probability:70, code:"WM109"/* 绊胶飘 */],
		[probability:70, code:"WP109"/* 单喉 荤捞靛 */],
		[probability:70, code:"WS110"/* 固胶飘 */],
		[probability:70, code:"WS210"/* 敲饭萍逞 家靛 */],
		[probability:70, code:"WT109"/* 酒唱能促 */],
		[probability:70, code:"DB107"/* 冰火靴 */],
		[probability:70, code:"DS107"/* 金刚盾 */],
		[probability:70, code:"OM109"/* 暗月 */],
		[probability:70, code:"DG107"/* 百裂护手 */],
		[probability:70, code:"OA207"/* 乌金臂环 */],
		[probability:70, code:"OR111"/* 封印之戒 */],
		[probability:70, code:"OA111"/* 圣者之链 */],
		[probability:33, code:"DA110"/* 百裂铠 */],
		[probability:33, code:"DA210"/* 信徒披风 */],
		[probability:33, code:"WA109"/* 破山斧 */],
		[probability:33, code:"WC109"/* 兽之斧刃 */],
		[probability:33, code:"WH110"/* 轩辕巨锤 */],
		[probability:33, code:"WM110"/* 圣者杖 */],
		[probability:33, code:"WP110"/* 白银之枪 */],
		[probability:33, code:"WS111"/* 龙骨战弓 */],
		[probability:33, code:"WS211"/* 斩马刀 */],
		[probability:33, code:"WT110"/* 飞云标 */],
		[probability:33, code:"DB108"/* 百战靴 */],
		[probability:33, code:"DS108"/* 赤龙焰盾 */],
		[probability:33, code:"OM110"/* 蓝色星辰 */],
		[probability:33, code:"DG108"/* 大地护手 */],
		[probability:33, code:"OA208"/* 百炼臂环 */],
		[probability:33, code:"OR112"/* 王者戒指 */],
		[probability:33, code:"OA112"/* 魔龙之心 */],
		[probability:33, code:"EC105"/* 公会卷轴 */],
		[probability:18, code:"DA111"/* 重装机铠 */],
		[probability:18, code:"DA211"/* 大法师袍 */],
		[probability:18, code:"WA110"/* 定神斧 */],
		[probability:18, code:"WC110"/* 九头刺蛇爪 */],
		[probability:18, code:"WH111"/* 赤冥之锤 */],
		[probability:18, code:"WM111"/* 王者杖 */],
		[probability:18, code:"WP111"/* 屠龙枪 */],
		[probability:18, code:"WS212"/* 嗜血屠魔剑 */],
		[probability:18, code:"WS112"/* 人马之辉 */],
		[probability:18, code:"WT111"/* 神标 */],
		[probability:18, code:"DB109"/* 大地靴 */],
		[probability:18, code:"DS109"/* 圣盾 */],
		[probability:18, code:"OM111"/* 淬火乌晶 */],
		[probability:18, code:"DG109"/* 神力护手 */],
		[probability:18, code:"OA209"/* 飞翼臂环 */],
		[probability:18, code:"EC102"/* 回城卷 */],
		[probability:18, code:"OR113"/* 灵魂之戒 */],
		[probability:18, code:"OA113"/* 生命之链 */],
		[probability:18, code:"OS106"/* 玄风石 */],
		[probability:6, code:"DA112"/* 战神宝铠 */],
		[probability:6, code:"DA212"/* 红莲战袍 */],
		[probability:6, code:"WA111"/* 天阙斧 */],
		[probability:6, code:"WC111"/* 利维坦 */],
		[probability:6, code:"WH112"/* 碎星锤 */],
		[probability:6, code:"WM112"/* 审判之杖 */],
		[probability:6, code:"WP112"/* 傲天枪 */],
		[probability:6, code:"WS213"/* 双截刃 */],
		[probability:6, code:"WS113"/* 猛犸巨弩 */],
		[probability:6, code:"WT112"/* 鸩尾标 */],
		[probability:6, code:"DB110"/* 地火战靴 */],
		[probability:6, code:"DS110"/* 宙斯盾 */],
		[probability:6, code:"OM112"/* 菱晶石 */],
		[probability:6, code:"DG110"/* 火云护手 */],
		[probability:6, code:"OA210"/* 百川流水臂环 */],
		[probability:6, code:"EC102"/* 回城卷 */],
		[probability:6, code:"OR114"/* 帝王之戒 */],
		[probability:6, code:"OA114"/* 神之庇护 */],
		[probability:6, code:"OS107"/* 水晶石 */],
		[probability:6, code:"GP108"/* 绿巨人水晶 */],
		[probability:6, code:"GP109"/* 神秘水晶 */],
		[probability:6, code:"GP110"/* 守护圣徒水晶 */],
		[probability:2, code:"DA113"/* 虎刹魔铠 */],
		[probability:2, code:"DA213"/* 幽绿之眼 */],
		[probability:2, code:"WA112"/* 奥丁斧 */],
		[probability:2, code:"WC112"/* 飞龙爪 */],
		[probability:2, code:"WH113"/* 破日锤 */],
		[probability:2, code:"WM113"/* 魔蜓杖 */],
		[probability:2, code:"WP113"/* 冥河战镰 */],
		[probability:2, code:"WS214"/* 金刚伏魔剑 */],
		[probability:2, code:"WS114"/* 爱神之翼 */],
		[probability:2, code:"WT113"/* 魔龙标 */],
		[probability:2, code:"DB111"/* 圣靴 */],
		[probability:2, code:"DS111"/* 苍穹之盾 */],
		[probability:2, code:"OM113"/* 西法路 */],
		[probability:2, code:"DG111"/* 黄铜护手 */],
		[probability:2, code:"OA211"/* 玄铁臂环 */],
		[probability:2, code:"EC102"/* 回城卷 */],
		[probability:2, code:"OR115"/* 守护之戒 */],
		[probability:2, code:"OA115"/* 暗印护符 */],
		[probability:2, code:"EC102"/* 回城卷 */],
		[probability:2, code:"OS107"/* 水晶石 */],
		[probability:2, code:"GP108"/* 绿巨人水晶 */],
		[probability:2, code:"GP109"/* 神秘水晶 */],
		[probability:2, code:"GP110"/* 守护圣徒水晶 */]
	],
	drops_more:[
	]
]
