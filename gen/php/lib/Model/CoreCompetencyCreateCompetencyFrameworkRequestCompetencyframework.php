<?php
/**
 * CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework
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
 * CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_competency_create_competency_framework_request_competencyframework';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'contextid' => 'int',
        'contextlevel' => 'string',
        'description' => 'string',
        'descriptionformat' => 'int',
        'idnumber' => 'string',
        'instanceid' => 'int',
        'scaleconfiguration' => 'string',
        'scaleid' => 'int',
        'shortname' => 'string',
        'taxonomies' => 'string',
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
        'contextid' => null,
        'contextlevel' => null,
        'description' => null,
        'descriptionformat' => null,
        'idnumber' => null,
        'instanceid' => null,
        'scaleconfiguration' => null,
        'scaleid' => null,
        'shortname' => null,
        'taxonomies' => null,
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
        'contextid' => false,
        'contextlevel' => false,
        'description' => false,
        'descriptionformat' => false,
        'idnumber' => false,
        'instanceid' => false,
        'scaleconfiguration' => false,
        'scaleid' => false,
        'shortname' => false,
        'taxonomies' => false,
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
        'contextid' => 'contextid',
        'contextlevel' => 'contextlevel',
        'description' => 'description',
        'descriptionformat' => 'descriptionformat',
        'idnumber' => 'idnumber',
        'instanceid' => 'instanceid',
        'scaleconfiguration' => 'scaleconfiguration',
        'scaleid' => 'scaleid',
        'shortname' => 'shortname',
        'taxonomies' => 'taxonomies',
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
        'contextid' => 'setContextid',
        'contextlevel' => 'setContextlevel',
        'description' => 'setDescription',
        'descriptionformat' => 'setDescriptionformat',
        'idnumber' => 'setIdnumber',
        'instanceid' => 'setInstanceid',
        'scaleconfiguration' => 'setScaleconfiguration',
        'scaleid' => 'setScaleid',
        'shortname' => 'setShortname',
        'taxonomies' => 'setTaxonomies',
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
        'contextid' => 'getContextid',
        'contextlevel' => 'getContextlevel',
        'description' => 'getDescription',
        'descriptionformat' => 'getDescriptionformat',
        'idnumber' => 'getIdnumber',
        'instanceid' => 'getInstanceid',
        'scaleconfiguration' => 'getScaleconfiguration',
        'scaleid' => 'getScaleid',
        'shortname' => 'getShortname',
        'taxonomies' => 'getTaxonomies',
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
        $this->setIfExists('contextid', $data ?? [], null);
        $this->setIfExists('contextlevel', $data ?? [], 'null');
        $this->setIfExists('description', $data ?? [], '');
        $this->setIfExists('descriptionformat', $data ?? [], 1);
        $this->setIfExists('idnumber', $data ?? [], null);
        $this->setIfExists('instanceid', $data ?? [], null);
        $this->setIfExists('scaleconfiguration', $data ?? [], 'null');
        $this->setIfExists('scaleid', $data ?? [], null);
        $this->setIfExists('shortname', $data ?? [], null);
        $this->setIfExists('taxonomies', $data ?? [], '');
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

        if ($this->container['idnumber'] === null) {
            $invalidProperties[] = "'idnumber' can't be null";
        }
        if ($this->container['scaleconfiguration'] === null) {
            $invalidProperties[] = "'scaleconfiguration' can't be null";
        }
        if ($this->container['scaleid'] === null) {
            $invalidProperties[] = "'scaleid' can't be null";
        }
        if ($this->container['shortname'] === null) {
            $invalidProperties[] = "'shortname' can't be null";
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
     * Gets contextid
     *
     * @return int|null
     */
    public function getContextid()
    {
        return $this->container['contextid'];
    }

    /**
     * Sets contextid
     *
     * @param int|null $contextid The context id
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
     * Gets contextlevel
     *
     * @return string|null
     */
    public function getContextlevel()
    {
        return $this->container['contextlevel'];
    }

    /**
     * Sets contextlevel
     *
     * @param string|null $contextlevel The context level
     *
     * @return self
     */
    public function setContextlevel($contextlevel)
    {
        if (is_null($contextlevel)) {
            throw new \InvalidArgumentException('non-nullable contextlevel cannot be null');
        }
        $this->container['contextlevel'] = $contextlevel;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string|null $description description
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
     * Gets idnumber
     *
     * @return string
     */
    public function getIdnumber()
    {
        return $this->container['idnumber'];
    }

    /**
     * Sets idnumber
     *
     * @param string $idnumber idnumber
     *
     * @return self
     */
    public function setIdnumber($idnumber)
    {
        if (is_null($idnumber)) {
            throw new \InvalidArgumentException('non-nullable idnumber cannot be null');
        }
        $this->container['idnumber'] = $idnumber;

        return $this;
    }

    /**
     * Gets instanceid
     *
     * @return int|null
     */
    public function getInstanceid()
    {
        return $this->container['instanceid'];
    }

    /**
     * Sets instanceid
     *
     * @param int|null $instanceid The Instance id
     *
     * @return self
     */
    public function setInstanceid($instanceid)
    {
        if (is_null($instanceid)) {
            throw new \InvalidArgumentException('non-nullable instanceid cannot be null');
        }
        $this->container['instanceid'] = $instanceid;

        return $this;
    }

    /**
     * Gets scaleconfiguration
     *
     * @return string
     */
    public function getScaleconfiguration()
    {
        return $this->container['scaleconfiguration'];
    }

    /**
     * Sets scaleconfiguration
     *
     * @param string $scaleconfiguration scaleconfiguration
     *
     * @return self
     */
    public function setScaleconfiguration($scaleconfiguration)
    {
        if (is_null($scaleconfiguration)) {
            throw new \InvalidArgumentException('non-nullable scaleconfiguration cannot be null');
        }
        $this->container['scaleconfiguration'] = $scaleconfiguration;

        return $this;
    }

    /**
     * Gets scaleid
     *
     * @return int
     */
    public function getScaleid()
    {
        return $this->container['scaleid'];
    }

    /**
     * Sets scaleid
     *
     * @param int $scaleid scaleid
     *
     * @return self
     */
    public function setScaleid($scaleid)
    {
        if (is_null($scaleid)) {
            throw new \InvalidArgumentException('non-nullable scaleid cannot be null');
        }
        $this->container['scaleid'] = $scaleid;

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
     * Gets taxonomies
     *
     * @return string|null
     */
    public function getTaxonomies()
    {
        return $this->container['taxonomies'];
    }

    /**
     * Sets taxonomies
     *
     * @param string|null $taxonomies taxonomies
     *
     * @return self
     */
    public function setTaxonomies($taxonomies)
    {
        if (is_null($taxonomies)) {
            throw new \InvalidArgumentException('non-nullable taxonomies cannot be null');
        }
        $this->container['taxonomies'] = $taxonomies;

        return $this;
    }

    /**
     * Gets timecreated
     *
     * @return int|null
     */
    public function getTimecreated()
    {
        return $this->container['timecreated'];
    }

    /**
     * Sets timecreated
     *
     * @param int|null $timecreated timecreated
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
     * @return int|null
     */
    public function getTimemodified()
    {
        return $this->container['timemodified'];
    }

    /**
     * Sets timemodified
     *
     * @param int|null $timemodified timemodified
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
     * @return int|null
     */
    public function getUsermodified()
    {
        return $this->container['usermodified'];
    }

    /**
     * Sets usermodified
     *
     * @param int|null $usermodified usermodified
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
     * @return bool|null
     */
    public function getVisible()
    {
        return $this->container['visible'];
    }

    /**
     * Sets visible
     *
     * @param bool|null $visible visible
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

