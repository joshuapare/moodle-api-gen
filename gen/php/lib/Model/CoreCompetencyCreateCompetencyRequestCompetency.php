<?php
/**
 * CoreCompetencyCreateCompetencyRequestCompetency
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
 * CoreCompetencyCreateCompetencyRequestCompetency Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCompetencyCreateCompetencyRequestCompetency implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_competency_create_competency_request_competency';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'competencyframeworkid' => 'int',
        'description' => 'string',
        'descriptionformat' => 'int',
        'idnumber' => 'string',
        'parentid' => 'int',
        'path' => 'string',
        'ruleconfig' => 'string',
        'ruleoutcome' => 'int',
        'ruletype' => 'string',
        'scaleconfiguration' => 'string',
        'scaleid' => 'int',
        'shortname' => 'string',
        'sortorder' => 'int',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'usermodified' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'competencyframeworkid' => null,
        'description' => null,
        'descriptionformat' => null,
        'idnumber' => null,
        'parentid' => null,
        'path' => null,
        'ruleconfig' => null,
        'ruleoutcome' => null,
        'ruletype' => null,
        'scaleconfiguration' => null,
        'scaleid' => null,
        'shortname' => null,
        'sortorder' => null,
        'timecreated' => null,
        'timemodified' => null,
        'usermodified' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'competencyframeworkid' => false,
        'description' => false,
        'descriptionformat' => false,
        'idnumber' => false,
        'parentid' => false,
        'path' => false,
        'ruleconfig' => false,
        'ruleoutcome' => false,
        'ruletype' => false,
        'scaleconfiguration' => false,
        'scaleid' => false,
        'shortname' => false,
        'sortorder' => false,
        'timecreated' => false,
        'timemodified' => false,
        'usermodified' => false
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
        'competencyframeworkid' => 'competencyframeworkid',
        'description' => 'description',
        'descriptionformat' => 'descriptionformat',
        'idnumber' => 'idnumber',
        'parentid' => 'parentid',
        'path' => 'path',
        'ruleconfig' => 'ruleconfig',
        'ruleoutcome' => 'ruleoutcome',
        'ruletype' => 'ruletype',
        'scaleconfiguration' => 'scaleconfiguration',
        'scaleid' => 'scaleid',
        'shortname' => 'shortname',
        'sortorder' => 'sortorder',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'usermodified' => 'usermodified'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'competencyframeworkid' => 'setCompetencyframeworkid',
        'description' => 'setDescription',
        'descriptionformat' => 'setDescriptionformat',
        'idnumber' => 'setIdnumber',
        'parentid' => 'setParentid',
        'path' => 'setPath',
        'ruleconfig' => 'setRuleconfig',
        'ruleoutcome' => 'setRuleoutcome',
        'ruletype' => 'setRuletype',
        'scaleconfiguration' => 'setScaleconfiguration',
        'scaleid' => 'setScaleid',
        'shortname' => 'setShortname',
        'sortorder' => 'setSortorder',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'usermodified' => 'setUsermodified'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'competencyframeworkid' => 'getCompetencyframeworkid',
        'description' => 'getDescription',
        'descriptionformat' => 'getDescriptionformat',
        'idnumber' => 'getIdnumber',
        'parentid' => 'getParentid',
        'path' => 'getPath',
        'ruleconfig' => 'getRuleconfig',
        'ruleoutcome' => 'getRuleoutcome',
        'ruletype' => 'getRuletype',
        'scaleconfiguration' => 'getScaleconfiguration',
        'scaleid' => 'getScaleid',
        'shortname' => 'getShortname',
        'sortorder' => 'getSortorder',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'usermodified' => 'getUsermodified'
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
        $this->setIfExists('competencyframeworkid', $data ?? [], 0);
        $this->setIfExists('description', $data ?? [], '');
        $this->setIfExists('descriptionformat', $data ?? [], 1);
        $this->setIfExists('idnumber', $data ?? [], null);
        $this->setIfExists('parentid', $data ?? [], 0);
        $this->setIfExists('path', $data ?? [], '/0/');
        $this->setIfExists('ruleconfig', $data ?? [], 'null');
        $this->setIfExists('ruleoutcome', $data ?? [], 0);
        $this->setIfExists('ruletype', $data ?? [], 'null');
        $this->setIfExists('scaleconfiguration', $data ?? [], 'null');
        $this->setIfExists('scaleid', $data ?? [], null);
        $this->setIfExists('shortname', $data ?? [], null);
        $this->setIfExists('sortorder', $data ?? [], 0);
        $this->setIfExists('timecreated', $data ?? [], 0);
        $this->setIfExists('timemodified', $data ?? [], 0);
        $this->setIfExists('usermodified', $data ?? [], 0);
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
     * Gets competencyframeworkid
     *
     * @return int|null
     */
    public function getCompetencyframeworkid()
    {
        return $this->container['competencyframeworkid'];
    }

    /**
     * Sets competencyframeworkid
     *
     * @param int|null $competencyframeworkid competencyframeworkid
     *
     * @return self
     */
    public function setCompetencyframeworkid($competencyframeworkid)
    {
        if (is_null($competencyframeworkid)) {
            throw new \InvalidArgumentException('non-nullable competencyframeworkid cannot be null');
        }
        $this->container['competencyframeworkid'] = $competencyframeworkid;

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
     * Gets parentid
     *
     * @return int|null
     */
    public function getParentid()
    {
        return $this->container['parentid'];
    }

    /**
     * Sets parentid
     *
     * @param int|null $parentid parentid
     *
     * @return self
     */
    public function setParentid($parentid)
    {
        if (is_null($parentid)) {
            throw new \InvalidArgumentException('non-nullable parentid cannot be null');
        }
        $this->container['parentid'] = $parentid;

        return $this;
    }

    /**
     * Gets path
     *
     * @return string|null
     */
    public function getPath()
    {
        return $this->container['path'];
    }

    /**
     * Sets path
     *
     * @param string|null $path path
     *
     * @return self
     */
    public function setPath($path)
    {
        if (is_null($path)) {
            throw new \InvalidArgumentException('non-nullable path cannot be null');
        }
        $this->container['path'] = $path;

        return $this;
    }

    /**
     * Gets ruleconfig
     *
     * @return string|null
     */
    public function getRuleconfig()
    {
        return $this->container['ruleconfig'];
    }

    /**
     * Sets ruleconfig
     *
     * @param string|null $ruleconfig ruleconfig
     *
     * @return self
     */
    public function setRuleconfig($ruleconfig)
    {
        if (is_null($ruleconfig)) {
            throw new \InvalidArgumentException('non-nullable ruleconfig cannot be null');
        }
        $this->container['ruleconfig'] = $ruleconfig;

        return $this;
    }

    /**
     * Gets ruleoutcome
     *
     * @return int|null
     */
    public function getRuleoutcome()
    {
        return $this->container['ruleoutcome'];
    }

    /**
     * Sets ruleoutcome
     *
     * @param int|null $ruleoutcome ruleoutcome
     *
     * @return self
     */
    public function setRuleoutcome($ruleoutcome)
    {
        if (is_null($ruleoutcome)) {
            throw new \InvalidArgumentException('non-nullable ruleoutcome cannot be null');
        }
        $this->container['ruleoutcome'] = $ruleoutcome;

        return $this;
    }

    /**
     * Gets ruletype
     *
     * @return string|null
     */
    public function getRuletype()
    {
        return $this->container['ruletype'];
    }

    /**
     * Sets ruletype
     *
     * @param string|null $ruletype ruletype
     *
     * @return self
     */
    public function setRuletype($ruletype)
    {
        if (is_null($ruletype)) {
            throw new \InvalidArgumentException('non-nullable ruletype cannot be null');
        }
        $this->container['ruletype'] = $ruletype;

        return $this;
    }

    /**
     * Gets scaleconfiguration
     *
     * @return string|null
     */
    public function getScaleconfiguration()
    {
        return $this->container['scaleconfiguration'];
    }

    /**
     * Sets scaleconfiguration
     *
     * @param string|null $scaleconfiguration scaleconfiguration
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
     * @return int|null
     */
    public function getScaleid()
    {
        return $this->container['scaleid'];
    }

    /**
     * Sets scaleid
     *
     * @param int|null $scaleid scaleid
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
     * Gets sortorder
     *
     * @return int|null
     */
    public function getSortorder()
    {
        return $this->container['sortorder'];
    }

    /**
     * Sets sortorder
     *
     * @param int|null $sortorder sortorder
     *
     * @return self
     */
    public function setSortorder($sortorder)
    {
        if (is_null($sortorder)) {
            throw new \InvalidArgumentException('non-nullable sortorder cannot be null');
        }
        $this->container['sortorder'] = $sortorder;

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

