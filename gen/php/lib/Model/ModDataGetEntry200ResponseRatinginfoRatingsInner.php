<?php
/**
 * ModDataGetEntry200ResponseRatinginfoRatingsInner
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
 * ModDataGetEntry200ResponseRatinginfoRatingsInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModDataGetEntry200ResponseRatinginfoRatingsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_data_get_entry_200_response_ratinginfo_ratings_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'aggregate' => 'float',
        'aggregatelabel' => 'string',
        'aggregatestr' => 'string',
        'canrate' => 'bool',
        'canviewaggregate' => 'bool',
        'count' => 'int',
        'itemid' => 'int',
        'rating' => 'int',
        'scaleid' => 'int',
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
        'aggregate' => null,
        'aggregatelabel' => null,
        'aggregatestr' => null,
        'canrate' => null,
        'canviewaggregate' => null,
        'count' => null,
        'itemid' => null,
        'rating' => null,
        'scaleid' => null,
        'userid' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'aggregate' => false,
        'aggregatelabel' => false,
        'aggregatestr' => false,
        'canrate' => false,
        'canviewaggregate' => false,
        'count' => false,
        'itemid' => false,
        'rating' => false,
        'scaleid' => false,
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
        'aggregate' => 'aggregate',
        'aggregatelabel' => 'aggregatelabel',
        'aggregatestr' => 'aggregatestr',
        'canrate' => 'canrate',
        'canviewaggregate' => 'canviewaggregate',
        'count' => 'count',
        'itemid' => 'itemid',
        'rating' => 'rating',
        'scaleid' => 'scaleid',
        'userid' => 'userid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'aggregate' => 'setAggregate',
        'aggregatelabel' => 'setAggregatelabel',
        'aggregatestr' => 'setAggregatestr',
        'canrate' => 'setCanrate',
        'canviewaggregate' => 'setCanviewaggregate',
        'count' => 'setCount',
        'itemid' => 'setItemid',
        'rating' => 'setRating',
        'scaleid' => 'setScaleid',
        'userid' => 'setUserid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'aggregate' => 'getAggregate',
        'aggregatelabel' => 'getAggregatelabel',
        'aggregatestr' => 'getAggregatestr',
        'canrate' => 'getCanrate',
        'canviewaggregate' => 'getCanviewaggregate',
        'count' => 'getCount',
        'itemid' => 'getItemid',
        'rating' => 'getRating',
        'scaleid' => 'getScaleid',
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
        $this->setIfExists('aggregate', $data ?? [], null);
        $this->setIfExists('aggregatelabel', $data ?? [], 'null');
        $this->setIfExists('aggregatestr', $data ?? [], 'null');
        $this->setIfExists('canrate', $data ?? [], null);
        $this->setIfExists('canviewaggregate', $data ?? [], null);
        $this->setIfExists('count', $data ?? [], null);
        $this->setIfExists('itemid', $data ?? [], null);
        $this->setIfExists('rating', $data ?? [], null);
        $this->setIfExists('scaleid', $data ?? [], null);
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
     * Gets aggregate
     *
     * @return float|null
     */
    public function getAggregate()
    {
        return $this->container['aggregate'];
    }

    /**
     * Sets aggregate
     *
     * @param float|null $aggregate Aggregated ratings grade.
     *
     * @return self
     */
    public function setAggregate($aggregate)
    {
        if (is_null($aggregate)) {
            throw new \InvalidArgumentException('non-nullable aggregate cannot be null');
        }
        $this->container['aggregate'] = $aggregate;

        return $this;
    }

    /**
     * Gets aggregatelabel
     *
     * @return string|null
     */
    public function getAggregatelabel()
    {
        return $this->container['aggregatelabel'];
    }

    /**
     * Sets aggregatelabel
     *
     * @param string|null $aggregatelabel The aggregation label.
     *
     * @return self
     */
    public function setAggregatelabel($aggregatelabel)
    {
        if (is_null($aggregatelabel)) {
            throw new \InvalidArgumentException('non-nullable aggregatelabel cannot be null');
        }
        $this->container['aggregatelabel'] = $aggregatelabel;

        return $this;
    }

    /**
     * Gets aggregatestr
     *
     * @return string|null
     */
    public function getAggregatestr()
    {
        return $this->container['aggregatestr'];
    }

    /**
     * Sets aggregatestr
     *
     * @param string|null $aggregatestr Aggregated ratings as string.
     *
     * @return self
     */
    public function setAggregatestr($aggregatestr)
    {
        if (is_null($aggregatestr)) {
            throw new \InvalidArgumentException('non-nullable aggregatestr cannot be null');
        }
        $this->container['aggregatestr'] = $aggregatestr;

        return $this;
    }

    /**
     * Gets canrate
     *
     * @return bool|null
     */
    public function getCanrate()
    {
        return $this->container['canrate'];
    }

    /**
     * Sets canrate
     *
     * @param bool|null $canrate Whether the user can rate the item.
     *
     * @return self
     */
    public function setCanrate($canrate)
    {
        if (is_null($canrate)) {
            throw new \InvalidArgumentException('non-nullable canrate cannot be null');
        }
        $this->container['canrate'] = $canrate;

        return $this;
    }

    /**
     * Gets canviewaggregate
     *
     * @return bool|null
     */
    public function getCanviewaggregate()
    {
        return $this->container['canviewaggregate'];
    }

    /**
     * Sets canviewaggregate
     *
     * @param bool|null $canviewaggregate Whether the user can view the aggregated grade.
     *
     * @return self
     */
    public function setCanviewaggregate($canviewaggregate)
    {
        if (is_null($canviewaggregate)) {
            throw new \InvalidArgumentException('non-nullable canviewaggregate cannot be null');
        }
        $this->container['canviewaggregate'] = $canviewaggregate;

        return $this;
    }

    /**
     * Gets count
     *
     * @return int|null
     */
    public function getCount()
    {
        return $this->container['count'];
    }

    /**
     * Sets count
     *
     * @param int|null $count Ratings count (used when aggregating).
     *
     * @return self
     */
    public function setCount($count)
    {
        if (is_null($count)) {
            throw new \InvalidArgumentException('non-nullable count cannot be null');
        }
        $this->container['count'] = $count;

        return $this;
    }

    /**
     * Gets itemid
     *
     * @return int|null
     */
    public function getItemid()
    {
        return $this->container['itemid'];
    }

    /**
     * Sets itemid
     *
     * @param int|null $itemid Item id.
     *
     * @return self
     */
    public function setItemid($itemid)
    {
        if (is_null($itemid)) {
            throw new \InvalidArgumentException('non-nullable itemid cannot be null');
        }
        $this->container['itemid'] = $itemid;

        return $this;
    }

    /**
     * Gets rating
     *
     * @return int|null
     */
    public function getRating()
    {
        return $this->container['rating'];
    }

    /**
     * Sets rating
     *
     * @param int|null $rating The rating the user gave.
     *
     * @return self
     */
    public function setRating($rating)
    {
        if (is_null($rating)) {
            throw new \InvalidArgumentException('non-nullable rating cannot be null');
        }
        $this->container['rating'] = $rating;

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
     * @param int|null $scaleid Scale id.
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
     * @param int|null $userid User who rated id.
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

