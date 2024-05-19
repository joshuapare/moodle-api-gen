<?php
/**
 * ModLessonGetContentPagesViewed200ResponsePagesInner
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
 * ModLessonGetContentPagesViewed200ResponsePagesInner Class Doc Comment
 *
 * @category Class
 * @description The content pages viewed.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModLessonGetContentPagesViewed200ResponsePagesInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_lesson_get_content_pages_viewed_200_response_pages_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'flag' => 'int',
        'id' => 'int',
        'lessonid' => 'int',
        'nextpageid' => 'int',
        'pageid' => 'int',
        'retry' => 'int',
        'timeseen' => 'int',
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
        'flag' => null,
        'id' => null,
        'lessonid' => null,
        'nextpageid' => null,
        'pageid' => null,
        'retry' => null,
        'timeseen' => null,
        'userid' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'flag' => false,
        'id' => false,
        'lessonid' => false,
        'nextpageid' => false,
        'pageid' => false,
        'retry' => false,
        'timeseen' => false,
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
        'flag' => 'flag',
        'id' => 'id',
        'lessonid' => 'lessonid',
        'nextpageid' => 'nextpageid',
        'pageid' => 'pageid',
        'retry' => 'retry',
        'timeseen' => 'timeseen',
        'userid' => 'userid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'flag' => 'setFlag',
        'id' => 'setId',
        'lessonid' => 'setLessonid',
        'nextpageid' => 'setNextpageid',
        'pageid' => 'setPageid',
        'retry' => 'setRetry',
        'timeseen' => 'setTimeseen',
        'userid' => 'setUserid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'flag' => 'getFlag',
        'id' => 'getId',
        'lessonid' => 'getLessonid',
        'nextpageid' => 'getNextpageid',
        'pageid' => 'getPageid',
        'retry' => 'getRetry',
        'timeseen' => 'getTimeseen',
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
        $this->setIfExists('flag', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('lessonid', $data ?? [], null);
        $this->setIfExists('nextpageid', $data ?? [], null);
        $this->setIfExists('pageid', $data ?? [], null);
        $this->setIfExists('retry', $data ?? [], null);
        $this->setIfExists('timeseen', $data ?? [], null);
        $this->setIfExists('userid', $data ?? [], null);
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
     * Gets flag
     *
     * @return int|null
     */
    public function getFlag()
    {
        return $this->container['flag'];
    }

    /**
     * Sets flag
     *
     * @param int|null $flag 1 if the next page was calculated randomly.
     *
     * @return self
     */
    public function setFlag($flag)
    {
        if (is_null($flag)) {
            throw new \InvalidArgumentException('non-nullable flag cannot be null');
        }
        $this->container['flag'] = $flag;

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
     * @param int|null $id The attempt id.
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
     * Gets lessonid
     *
     * @return int|null
     */
    public function getLessonid()
    {
        return $this->container['lessonid'];
    }

    /**
     * Sets lessonid
     *
     * @param int|null $lessonid The lesson id.
     *
     * @return self
     */
    public function setLessonid($lessonid)
    {
        if (is_null($lessonid)) {
            throw new \InvalidArgumentException('non-nullable lessonid cannot be null');
        }
        $this->container['lessonid'] = $lessonid;

        return $this;
    }

    /**
     * Gets nextpageid
     *
     * @return int|null
     */
    public function getNextpageid()
    {
        return $this->container['nextpageid'];
    }

    /**
     * Sets nextpageid
     *
     * @param int|null $nextpageid The next page chosen id.
     *
     * @return self
     */
    public function setNextpageid($nextpageid)
    {
        if (is_null($nextpageid)) {
            throw new \InvalidArgumentException('non-nullable nextpageid cannot be null');
        }
        $this->container['nextpageid'] = $nextpageid;

        return $this;
    }

    /**
     * Gets pageid
     *
     * @return int|null
     */
    public function getPageid()
    {
        return $this->container['pageid'];
    }

    /**
     * Sets pageid
     *
     * @param int|null $pageid The page id.
     *
     * @return self
     */
    public function setPageid($pageid)
    {
        if (is_null($pageid)) {
            throw new \InvalidArgumentException('non-nullable pageid cannot be null');
        }
        $this->container['pageid'] = $pageid;

        return $this;
    }

    /**
     * Gets retry
     *
     * @return int|null
     */
    public function getRetry()
    {
        return $this->container['retry'];
    }

    /**
     * Sets retry
     *
     * @param int|null $retry The lesson attempt number.
     *
     * @return self
     */
    public function setRetry($retry)
    {
        if (is_null($retry)) {
            throw new \InvalidArgumentException('non-nullable retry cannot be null');
        }
        $this->container['retry'] = $retry;

        return $this;
    }

    /**
     * Gets timeseen
     *
     * @return int|null
     */
    public function getTimeseen()
    {
        return $this->container['timeseen'];
    }

    /**
     * Sets timeseen
     *
     * @param int|null $timeseen The time the page was seen.
     *
     * @return self
     */
    public function setTimeseen($timeseen)
    {
        if (is_null($timeseen)) {
            throw new \InvalidArgumentException('non-nullable timeseen cannot be null');
        }
        $this->container['timeseen'] = $timeseen;

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
     * @param int|null $userid The user who viewed the page.
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


