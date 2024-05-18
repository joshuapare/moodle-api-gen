<?php
/**
 * CoreCompetencyCreatePlanRequestPlan
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
 * CoreCompetencyCreatePlanRequestPlan Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCompetencyCreatePlanRequestPlan implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_competency_create_plan_request_plan';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'description' => 'string',
        'descriptionformat' => 'int',
        'duedate' => 'int',
        'name' => 'string',
        'origtemplateid' => 'int',
        'reviewerid' => 'int',
        'status' => 'int',
        'templateid' => 'int',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'userid' => 'int',
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
        'description' => null,
        'descriptionformat' => null,
        'duedate' => null,
        'name' => null,
        'origtemplateid' => null,
        'reviewerid' => null,
        'status' => null,
        'templateid' => null,
        'timecreated' => null,
        'timemodified' => null,
        'userid' => null,
        'usermodified' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'description' => false,
        'descriptionformat' => false,
        'duedate' => false,
        'name' => false,
        'origtemplateid' => false,
        'reviewerid' => false,
        'status' => false,
        'templateid' => false,
        'timecreated' => false,
        'timemodified' => false,
        'userid' => false,
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
        'description' => 'description',
        'descriptionformat' => 'descriptionformat',
        'duedate' => 'duedate',
        'name' => 'name',
        'origtemplateid' => 'origtemplateid',
        'reviewerid' => 'reviewerid',
        'status' => 'status',
        'templateid' => 'templateid',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'userid' => 'userid',
        'usermodified' => 'usermodified'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'description' => 'setDescription',
        'descriptionformat' => 'setDescriptionformat',
        'duedate' => 'setDuedate',
        'name' => 'setName',
        'origtemplateid' => 'setOrigtemplateid',
        'reviewerid' => 'setReviewerid',
        'status' => 'setStatus',
        'templateid' => 'setTemplateid',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'userid' => 'setUserid',
        'usermodified' => 'setUsermodified'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'description' => 'getDescription',
        'descriptionformat' => 'getDescriptionformat',
        'duedate' => 'getDuedate',
        'name' => 'getName',
        'origtemplateid' => 'getOrigtemplateid',
        'reviewerid' => 'getReviewerid',
        'status' => 'getStatus',
        'templateid' => 'getTemplateid',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'userid' => 'getUserid',
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
        $this->setIfExists('description', $data ?? [], '');
        $this->setIfExists('descriptionformat', $data ?? [], 1);
        $this->setIfExists('duedate', $data ?? [], 0);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('origtemplateid', $data ?? [], null);
        $this->setIfExists('reviewerid', $data ?? [], null);
        $this->setIfExists('status', $data ?? [], 0);
        $this->setIfExists('templateid', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], 0);
        $this->setIfExists('timemodified', $data ?? [], 0);
        $this->setIfExists('userid', $data ?? [], null);
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

        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['userid'] === null) {
            $invalidProperties[] = "'userid' can't be null";
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
     * Gets duedate
     *
     * @return int|null
     */
    public function getDuedate()
    {
        return $this->container['duedate'];
    }

    /**
     * Sets duedate
     *
     * @param int|null $duedate duedate
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
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name name
     *
     * @return self
     */
    public function setName($name)
    {
        if (is_null($name)) {
            throw new \InvalidArgumentException('non-nullable name cannot be null');
        }
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets origtemplateid
     *
     * @return int|null
     */
    public function getOrigtemplateid()
    {
        return $this->container['origtemplateid'];
    }

    /**
     * Sets origtemplateid
     *
     * @param int|null $origtemplateid origtemplateid
     *
     * @return self
     */
    public function setOrigtemplateid($origtemplateid)
    {
        if (is_null($origtemplateid)) {
            throw new \InvalidArgumentException('non-nullable origtemplateid cannot be null');
        }
        $this->container['origtemplateid'] = $origtemplateid;

        return $this;
    }

    /**
     * Gets reviewerid
     *
     * @return int|null
     */
    public function getReviewerid()
    {
        return $this->container['reviewerid'];
    }

    /**
     * Sets reviewerid
     *
     * @param int|null $reviewerid reviewerid
     *
     * @return self
     */
    public function setReviewerid($reviewerid)
    {
        if (is_null($reviewerid)) {
            throw new \InvalidArgumentException('non-nullable reviewerid cannot be null');
        }
        $this->container['reviewerid'] = $reviewerid;

        return $this;
    }

    /**
     * Gets status
     *
     * @return int|null
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param int|null $status status
     *
     * @return self
     */
    public function setStatus($status)
    {
        if (is_null($status)) {
            throw new \InvalidArgumentException('non-nullable status cannot be null');
        }
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets templateid
     *
     * @return int|null
     */
    public function getTemplateid()
    {
        return $this->container['templateid'];
    }

    /**
     * Sets templateid
     *
     * @param int|null $templateid templateid
     *
     * @return self
     */
    public function setTemplateid($templateid)
    {
        if (is_null($templateid)) {
            throw new \InvalidArgumentException('non-nullable templateid cannot be null');
        }
        $this->container['templateid'] = $templateid;

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
     * Gets userid
     *
     * @return int
     */
    public function getUserid()
    {
        return $this->container['userid'];
    }

    /**
     * Sets userid
     *
     * @param int $userid userid
     *
     * @return self
     */
    public function setUserid($userid)
    {
        if (is_null($userid)) {
            throw new \InvalidArgumentException('non-nullable userid cannot be null');
        }
        $this->container['userid'] = $userid;

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

