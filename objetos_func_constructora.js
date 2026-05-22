// ==========================================
// OBJETO BASE
// ==========================================

const player = {

    // Propiedades
    name: "Ash",
    level: 5,
    hp: 42,
    maxHp: 100,
    atk: 12,

    inventory: [
        "Potion",
        "Apple"
    ],

    weapon: "Wooden Bat",

    // ==========================================
    // MÉTODO DESCRIBIR
    // ==========================================

    describe() {

        return `${this.name} (Lv. ${this.level})
HP: ${this.hp}/${this.maxHp}
ATK: ${this.atk}
Arma: ${this.weapon}`;
    },

    // ==========================================
    // MÉTODO ATAQUE
    // ==========================================

    attack() {

        // Variación aleatoria de daño ±10%
        const variance = Math.random() * 0.2 - 0.1;

        // Cálculo de daño
        const rawDamage = this.atk * (1 + variance);

        // Convertir a entero y mínimo 1
        const damage = Math.max(1, Math.trunc(rawDamage));

        return `${this.name} ataca con ${this.weapon}
e inflige ${damage} de daño.`;
    },

    // ==========================================
    // MÉTODO CURAR
    // ==========================================

    heal(amount) {

        this.hp = Math.min(
            this.maxHp,
            this.hp + amount
        );

        return `${this.name} recupera ${amount} HP.
HP actual: ${this.hp}/${this.maxHp}`;
    }
};

// ==========================================
// MOSTRAR DATOS
// ==========================================

console.log(player.describe());

console.log(player.attack());

console.log(player.heal(15));

// ==========================================
// TYPEOF Y CONVERSIÓN
// ==========================================

console.log(typeof player);            // object
console.log(typeof player.describe);   // function
console.log(typeof player.name);       // string
console.log(typeof player.level);      // number

// Simulación de input tipo string
const inputLevel = "7";

console.log(typeof inputLevel);

// Convertir a número
const parsedLevel = Number(inputLevel);

console.log(typeof parsedLevel, parsedLevel);

// Actualizar nivel
player.level = parsedLevel;

console.log(player.describe());

// ==========================================
// FUNCIÓN CONSTRUCTORA
// ==========================================

function Player(
    name,
    level,
    hp,
    atk,
    weapon = "Fists"
) {

    this.name = name;
    this.level = level;
    this.hp = hp;
    this.maxHp = hp;
    this.atk = atk;
    this.weapon = weapon;

    // ==========================================
    // MÉTODO DESCRIBIR
    // ==========================================

    this.describe = function () {

        return `${this.name} (Lv. ${this.level})
HP: ${this.hp}/${this.maxHp}
ATK: ${this.atk}
Arma: ${this.weapon}`;
    };

    // ==========================================
    // MÉTODO ATAQUE
    // ==========================================

    this.attack = function () {

        const variance =
            Math.random() * 0.2 - 0.1;

        const rawDamage =
            this.atk * (1 + variance);

        const damage =
            Math.max(1, Math.trunc(rawDamage));

        return `${this.name} inflige ${damage} de daño.`;
    };

    // ==========================================
    // MÉTODO CURAR
    // ==========================================

    this.heal = function (amount) {

        this.hp = Math.min(
            this.maxHp,
            this.hp + amount
        );

        return `${this.name} recupera ${amount} HP.`;
    };
}

// ==========================================
// CREAR INSTANCIAS
// ==========================================

const p1 = new Player(
    "Unnamed",
    3,
    30,
    9,
    "Dagger"
);

const p2 = new Player(
    "Sinick",
    10,
    80,
    18,
    "Sword"
);

// ==========================================
// PRUEBAS
// ==========================================

console.log(p1.describe());

console.log(p2.describe());

console.log(p1.attack());

console.log(p2.heal(10));