<?php
/**
 * ModDataSearchEntries200ResponseEntriesInner
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
 * ModDataSearchEntries200ResponseEntriesInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModDataSearchEntries200ResponseEntriesInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_data_search_entries_200_response_entries_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'approved' => 'bool',
        'canmanageentry' => 'bool',
        'contents' => '\OpenAPI\Client\Model\ModDataGetEntry200ResponseEntryContentsInner[]',
        'dataid' => 'int',
        'fullname' => 'string',
        'groupid' => 'int',
        'id' => 'int',
        'tags' => '\OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerTagsInner[]',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'userid' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'approved' => null,
        'canmanageentry' => null,
        'contents' => null,
        'dataid' => null,
        'fullname' => null,
        'groupid' => null,
        'id' => null,
        'tags' => null,
        'timecreated' => null,
        'timemodified' => null,
        'userid' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'approved' => false,
        'canmanageentry' => false,
        'contents' => false,
        'dataid' => false,
        'fullname' => false,
        'groupid' => false,
        'id' => false,
        'tags' => false,
        'timecreated' => false,
        'timemodified' => false,
        'userid' => false
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
        'approved' => 'approved',
        'canmanageentry' => 'canmanageentry',
        'contents' => 'contents',
        'dataid' => 'dataid',
        'fullname' => 'fullname',
        'groupid' => 'groupid',
        'id' => 'id',
        'tags' => 'tags',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'userid' => 'userid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'approved' => 'setApproved',
        'canmanageentry' => 'setCanmanageentry',
        'contents' => 'setContents',
        'dataid' => 'setDataid',
        'fullname' => 'setFullname',
        'groupid' => 'setGroupid',
        'id' => 'setId',
        'tags' => 'setTags',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'userid' => 'setUserid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'approved' => 'getApproved',
        'canmanageentry' => 'getCanmanageentry',
        'contents' => 'getContents',
        'dataid' => 'getDataid',
        'fullname' => 'getFullname',
        'groupid' => 'getGroupid',
        'id' => 'getId',
        'tags' => 'getTags',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'userid' => 'getUserid'
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
        $this->setIfExists('approved', $data ?? [], 0);
        $this->setIfExists('canmanageentry', $data ?? [], null);
        $this->setIfExists('contents', $data ?? [], null);
        $this->setIfExists('dataid', $data ?? [], 0);
        $this->setIfExists('fullname', $data ?? [], null);
        $this->setIfExists('groupid', $data ?? [], 0);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('tags', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], 0);
        $this->setIfExists('timemodified', $data ?? [], 0);
        $this->setIfExists('userid', $data ?? [], 0);
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
     * Gets approved
     *
     * @return bool|null
     */
    public function getApproved()
    {
        return $this->container['approved'];
    }

    /**
     * Sets approved
     *
     * @param bool|null $approved Whether the entry has been approved (if the database is configured in that way).
     *
     * @return self
     */
    public function setApproved($approved)
    {
        if (is_null($approved)) {
            throw new \InvalidArgumentException('non-nullable approved cannot be null');
        }
        $this->container['approved'] = $approved;

        return $this;
    }

    /**
     * Gets canmanageentry
     *
     * @return bool|null
     */
    public function getCanmanageentry()
    {
        return $this->container['canmanageentry'];
    }

    /**
     * Sets canmanageentry
     *
     * @param bool|null $canmanageentry Whether the current user can manage this entry
     *
     * @return self
     */
    public function setCanmanageentry($canmanageentry)
    {
        if (is_null($canmanageentry)) {
            throw new \InvalidArgumentException('non-nullable canmanageentry cannot be null');
        }
        $this->container['canmanageentry'] = $canmanageentry;

        return $this;
    }

    /**
     * Gets contents
     *
     * @return \OpenAPI\Client\Model\ModDataGetEntry200ResponseEntryContentsInner[]|null
     */
    public function getContents()
    {
        return $this->container['contents'];
    }

    /**
     * Sets contents
     *
     * @param \OpenAPI\Client\Model\ModDataGetEntry200ResponseEntryContentsInner[]|null $contents contents
     *
     * @return self
     */
    public function setContents($contents)
    {
        if (is_null($contents)) {
            throw new \InvalidArgumentException('non-nullable contents cannot be null');
        }
        $this->container['contents'] = $contents;

        return $this;
    }

    /**
     * Gets dataid
     *
     * @return int|null
     */
    public function getDataid()
    {
        return $this->container['dataid'];
    }

    /**
     * Sets dataid
     *
     * @param int|null $dataid The database id this record belongs to.
     *
     * @return self
     */
    public function setDataid($dataid)
    {
        if (is_null($dataid)) {
            throw new \InvalidArgumentException('non-nullable dataid cannot be null');
        }
        $this->container['dataid'] = $dataid;

        return $this;
    }

    /**
     * Gets fullname
     *
     * @return string|null
     */
    public function getFullname()
    {
        return $this->container['fullname'];
    }

    /**
     * Sets fullname
     *
     * @param string|null $fullname The user who created the entry fullname.
     *
     * @return self
     */
    public function setFullname($fullname)
    {
        if (is_null($fullname)) {
            throw new \InvalidArgumentException('non-nullable fullname cannot be null');
        }
        $this->container['fullname'] = $fullname;

        return $this;
    }

    /**
     * Gets groupid
     *
     * @return int|null
     */
    public function getGroupid()
    {
        return $this->container['groupid'];
    }

    /**
     * Sets groupid
     *
     * @param int|null $groupid The group id this record belongs to (0 for no groups).
     *
     * @return self
     */
    public function setGroupid($groupid)
    {
        if (is_null($groupid)) {
            throw new \InvalidArgumentException('non-nullable groupid cannot be null');
        }
        $this->container['groupid'] = $groupid;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int|null $id Record id.
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
     * Gets tags
     *
     * @return \OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerTagsInner[]|null
     */
    public function getTags()
    {
        return $this->container['tags'];
    }

    /**
     * Sets tags
     *
     * @param \OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerTagsInner[]|null $tags tags
     *
     * @return self
     */
    public function setTags($tags)
    {
        if (is_null($tags)) {
            throw new \InvalidArgumentException('non-nullable tags cannot be null');
        }
        $this->container['tags'] = $tags;

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
     * @param int|null $timecreated Time the record was created.
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
     * @param int|null $timemodified Last time the record was modified.
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
     * @return int|null
     */
    public function getUserid()
    {
        return $this->container['userid'];
    }

    /**
     * Sets userid
     *
     * @param int|null $userid The id of the user who created the record.
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


