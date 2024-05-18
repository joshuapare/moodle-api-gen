<?php
/**
 * CoreCompetencyCreatePlan200ResponseTemplate
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.5.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * CoreCompetencyCreatePlan200ResponseTemplate Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCompetencyCreatePlan200ResponseTemplate implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_competency_create_plan_200_response_template';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'canmanage' => 'bool',
        'canread' => 'bool',
        'cohortscount' => 'int',
        'contextid' => 'int',
        'contextname' => 'string',
        'contextnamenoprefix' => 'string',
        'description' => 'string',
        'descriptionformat' => 'int',
        'duedate' => 'int',
        'duedateformatted' => 'string',
        'id' => 'int',
        'planscount' => 'int',
        'shortname' => 'string',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'usermodified' => 'int',
        'visible' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'canmanage' => null,
        'canread' => null,
        'cohortscount' => null,
        'contextid' => null,
        'contextname' => null,
        'contextnamenoprefix' => null,
        'description' => null,
        'descriptionformat' => null,
        'duedate' => null,
        'duedateformatted' => null,
        'id' => null,
        'planscount' => null,
        'shortname' => null,
        'timecreated' => null,
        'timemodified' => null,
        'usermodified' => null,
        'visible' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'canmanage' => false,
        'canread' => false,
        'cohortscount' => false,
        'contextid' => false,
        'contextname' => false,
        'contextnamenoprefix' => false,
        'description' => false,
        'descriptionformat' => false,
        'duedate' => false,
        'duedateformatted' => false,
        'id' => false,
        'planscount' => false,
        'shortname' => false,
        'timecreated' => false,
        'timemodified' => false,
        'usermodified' => false,
        'visible' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'canmanage' => 'canmanage',
        'canread' => 'canread',
        'cohortscount' => 'cohortscount',
        'contextid' => 'contextid',
        'contextname' => 'contextname',
        'contextnamenoprefix' => 'contextnamenoprefix',
        'description' => 'description',
        'descriptionformat' => 'descriptionformat',
        'duedate' => 'duedate',
        'duedateformatted' => 'duedateformatted',
        'id' => 'id',
        'planscount' => 'planscount',
        'shortname' => 'shortname',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'usermodified' => 'usermodified',
        'visible' => 'visible'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'canmanage' => 'setCanmanage',
        'canread' => 'setCanread',
        'cohortscount' => 'setCohortscount',
        'contextid' => 'setContextid',
        'contextname' => 'setContextname',
        'contextnamenoprefix' => 'setContextnamenoprefix',
        'description' => 'setDescription',
        'descriptionformat' => 'setDescriptionformat',
        'duedate' => 'setDuedate',
        'duedateformatted' => 'setDuedateformatted',
        'id' => 'setId',
        'planscount' => 'setPlanscount',
        'shortname' => 'setShortname',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'usermodified' => 'setUsermodified',
        'visible' => 'setVisible'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'canmanage' => 'getCanmanage',
        'canread' => 'getCanread',
        'cohortscount' => 'getCohortscount',
        'contextid' => 'getContextid',
        'contextname' => 'getContextname',
        'contextnamenoprefix' => 'getContextnamenoprefix',
        'description' => 'getDescription',
        'descriptionformat' => 'getDescriptionformat',
        'duedate' => 'getDuedate',
        'duedateformatted' => 'getDuedateformatted',
        'id' => 'getId',
        'planscount' => 'getPlanscount',
        'shortname' => 'getShortname',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'usermodified' => 'getUsermodified',
        'visible' => 'getVisible'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('canmanage', $data ?? [], null);
        $this->setIfExists('canread', $data ?? [], null);
        $this->setIfExists('cohortscount', $data ?? [], null);
        $this->setIfExists('contextid', $data ?? [], null);
        $this->setIfExists('contextname', $data ?? [], null);
        $this->setIfExists('contextnamenoprefix', $data ?? [], null);
        $this->setIfExists('description', $data ?? [], '');
        $this->setIfExists('descriptionformat', $data ?? [], 1);
        $this->setIfExists('duedate', $data ?? [], 0);
        $this->setIfExists('duedateformatted', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], 0);
        $this->setIfExists('planscount', $data ?? [], null);
        $this->setIfExists('shortname', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], 0);
        $this->setIfExists('timemodified', $data ?? [], 0);
        $this->setIfExists('usermodified', $data ?? [], 0);
        $this->setIfExists('visible', $data ?? [], 1);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['canmanage'] === null) {
            $invalidProperties[] = "'canmanage' can't be null";
        }
        if ($this->container['canread'] === null) {
            $invalidProperties[] = "'canread' can't be null";
        }
        if ($this->container['cohortscount'] === null) {
            $invalidProperties[] = "'cohortscount' can't be null";
        }
        if ($this->container['contextid'] === null) {
            $invalidProperties[] = "'contextid' can't be null";
        }
        if ($this->container['contextname'] === null) {
            $invalidProperties[] = "'contextname' can't be null";
        }
        if ($this->container['contextnamenoprefix'] === null) {
            $invalidProperties[] = "'contextnamenoprefix' can't be null";
        }
        if ($this->container['description'] === null) {
            $invalidProperties[] = "'description' can't be null";
        }
        if ($this->container['duedate'] === null) {
            $invalidProperties[] = "'duedate' can't be null";
        }
        if ($this->container['duedateformatted'] === null) {
            $invalidProperties[] = "'duedateformatted' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['planscount'] === null) {
            $invalidProperties[] = "'planscount' can't be null";
        }
        if ($this->container['shortname'] === null) {
            $invalidProperties[] = "'shortname' can't be null";
        }
        if ($this->container['timecreated'] === null) {
            $invalidProperties[] = "'timecreated' can't be null";
        }
        if ($this->container['timemodified'] === null) {
            $invalidProperties[] = "'timemodified' can't be null";
        }
        if ($this->container['usermodified'] === null) {
            $invalidProperties[] = "'usermodified' can't be null";
        }
        if ($this->container['visible'] === null) {
            $invalidProperties[] = "'visible' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets canmanage
     *
     * @return bool
     */
    public function getCanmanage()
    {
        return $this->container['canmanage'];
    }

    /**
     * Sets canmanage
     *
     * @param bool $canmanage canmanage
     *
     * @return self
     */
    public function setCanmanage($canmanage)
    {
        if (is_null($canmanage)) {
            throw new \InvalidArgumentException('non-nullable canmanage cannot be null');
        }
        $this->container['canmanage'] = $canmanage;

        return $this;
    }

    /**
     * Gets canread
     *
     * @return bool
     */
    public function getCanread()
    {
        return $this->container['canread'];
    }

    /**
     * Sets canread
     *
     * @param bool $canread canread
     *
     * @return self
     */
    public function setCanread($canread)
    {
        if (is_null($canread)) {
            throw new \InvalidArgumentException('non-nullable canread cannot be null');
        }
        $this->container['canread'] = $canread;

        return $this;
    }

    /**
     * Gets cohortscount
     *
     * @return int
     */
    public function getCohortscount()
    {
        return $this->container['cohortscount'];
    }

    /**
     * Sets cohortscount
     *
     * @param int $cohortscount cohortscount
     *
     * @return self
     */
    public function setCohortscount($cohortscount)
    {
        if (is_null($cohortscount)) {
            throw new \InvalidArgumentException('non-nullable cohortscount cannot be null');
        }
        $this->container['cohortscount'] = $cohortscount;

        return $this;
    }

    /**
     * Gets contextid
     *
     * @return int
     */
    public function getContextid()
    {
        return $this->container['contextid'];
    }

    /**
     * Sets contextid
     *
     * @param int $contextid contextid
     *
     * @return self
     */
    public function setContextid($contextid)
    {
        if (is_null($contextid)) {
            throw new \InvalidArgumentException('non-nullable contextid cannot be null');
        }
        $this->container['contextid'] = $contextid;

        return $this;
    }

    /**
     * Gets contextname
     *
     * @return string
     */
    public function getContextname()
    {
        return $this->container['contextname'];
    }

    /**
     * Sets contextname
     *
     * @param string $contextname contextname
     *
     * @return self
     */
    public function setContextname($contextname)
    {
        if (is_null($contextname)) {
            throw new \InvalidArgumentException('non-nullable contextname cannot be null');
        }
        $this->container['contextname'] = $contextname;

        return $this;
    }

    /**
     * Gets contextnamenoprefix
     *
     * @return string
     */
    public function getContextnamenoprefix()
    {
        return $this->container['contextnamenoprefix'];
    }

    /**
     * Sets contextnamenoprefix
     *
     * @param string $contextnamenoprefix contextnamenoprefix
     *
     * @return self
     */
    public function setContextnamenoprefix($contextnamenoprefix)
    {
        if (is_null($contextnamenoprefix)) {
            throw new \InvalidArgumentException('non-nullable contextnamenoprefix cannot be null');
        }
        $this->container['contextnamenoprefix'] = $contextnamenoprefix;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string $description description
     *
     * @return self
     */
    public function setDescription($description)
    {
        if (is_null($description)) {
            throw new \InvalidArgumentException('non-nullable description cannot be null');
        }
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets descriptionformat
     *
     * @return int|null
     */
    public function getDescriptionformat()
    {
        return $this->container['descriptionformat'];
    }

    /**
     * Sets descriptionformat
     *
     * @param int|null $descriptionformat description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setDescriptionformat($descriptionformat)
    {
        if (is_null($descriptionformat)) {
            throw new \InvalidArgumentException('non-nullable descriptionformat cannot be null');
        }
        $this->container['descriptionformat'] = $descriptionformat;

        return $this;
    }

    /**
     * Gets duedate
     *
     * @return int
     */
    public function getDuedate()
    {
        return $this->container['duedate'];
    }

    /**
     * Sets duedate
     *
     * @param int $duedate duedate
     *
     * @return self
     */
    public function setDuedate($duedate)
    {
        if (is_null($duedate)) {
            throw new \InvalidArgumentException('non-nullable duedate cannot be null');
        }
        $this->container['duedate'] = $duedate;

        return $this;
    }

    /**
     * Gets duedateformatted
     *
     * @return string
     */
    public function getDuedateformatted()
    {
        return $this->container['duedateformatted'];
    }

    /**
     * Sets duedateformatted
     *
     * @param string $duedateformatted duedateformatted
     *
     * @return self
     */
    public function setDuedateformatted($duedateformatted)
    {
        if (is_null($duedateformatted)) {
            throw new \InvalidArgumentException('non-nullable duedateformatted cannot be null');
        }
        $this->container['duedateformatted'] = $duedateformatted;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int $id id
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets planscount
     *
     * @return int
     */
    public function getPlanscount()
    {
        return $this->container['planscount'];
    }

    /**
     * Sets planscount
     *
     * @param int $planscount planscount
     *
     * @return self
     */
    public function setPlanscount($planscount)
    {
        if (is_null($planscount)) {
            throw new \InvalidArgumentException('non-nullable planscount cannot be null');
        }
        $this->container['planscount'] = $planscount;

        return $this;
    }

    /**
     * Gets shortname
     *
     * @return string
     */
    public function getShortname()
    {
        return $this->container['shortname'];
    }

    /**
     * Sets shortname
     *
     * @param string $shortname shortname
     *
     * @return self
     */
    public function setShortname($shortname)
    {
        if (is_null($shortname)) {
            throw new \InvalidArgumentException('non-nullable shortname cannot be null');
        }
        $this->container['shortname'] = $shortname;

        return $this;
    }

    /**
     * Gets timecreated
     *
     * @return int
     */
    public function getTimecreated()
    {
        return $this->container['timecreated'];
    }

    /**
     * Sets timecreated
     *
     * @param int $timecreated timecreated
     *
     * @return self
     */
    public function setTimecreated($timecreated)
    {
        if (is_null($timecreated)) {
            throw new \InvalidArgumentException('non-nullable timecreated cannot be null');
        }
        $this->container['timecreated'] = $timecreated;

        return $this;
    }

    /**
     * Gets timemodified
     *
     * @return int
     */
    public function getTimemodified()
    {
        return $this->container['timemodified'];
    }

    /**
     * Sets timemodified
     *
     * @param int $timemodified timemodified
     *
     * @return self
     */
    public function setTimemodified($timemodified)
    {
        if (is_null($timemodified)) {
            throw new \InvalidArgumentException('non-nullable timemodified cannot be null');
        }
        $this->container['timemodified'] = $timemodified;

        return $this;
    }

    /**
     * Gets usermodified
     *
     * @return int
     */
    public function getUsermodified()
    {
        return $this->container['usermodified'];
    }

    /**
     * Sets usermodified
     *
     * @param int $usermodified usermodified
     *
     * @return self
     */
    public function setUsermodified($usermodified)
    {
        if (is_null($usermodified)) {
            throw new \InvalidArgumentException('non-nullable usermodified cannot be null');
        }
        $this->container['usermodified'] = $usermodified;

        return $this;
    }

    /**
     * Gets visible
     *
     * @return bool
     */
    public function getVisible()
    {
        return $this->container['visible'];
    }

    /**
     * Sets visible
     *
     * @param bool $visible visible
     *
     * @return self
     */
    public function setVisible($visible)
    {
        if (is_null($visible)) {
            throw new \InvalidArgumentException('non-nullable visible cannot be null');
        }
        $this->container['visible'] = $visible;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


