<?php
/**
 * ModWikiGetSubwikiPages200ResponsePagesInner
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
 * ModWikiGetSubwikiPages200ResponsePagesInner Class Doc Comment
 *
 * @category Class
 * @description Pages
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModWikiGetSubwikiPages200ResponsePagesInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_wiki_get_subwiki_pages_200_response_pages_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'cachedcontent' => 'string',
        'caneditpage' => 'bool',
        'contentformat' => 'int',
        'contentsize' => 'int',
        'firstpage' => 'bool',
        'id' => 'int',
        'pageviews' => 'int',
        'readonly' => 'int',
        'subwikiid' => 'int',
        'tags' => '\OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerTagsInner[]',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'timerendered' => 'int',
        'title' => 'string',
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
        'cachedcontent' => null,
        'caneditpage' => null,
        'contentformat' => null,
        'contentsize' => null,
        'firstpage' => null,
        'id' => null,
        'pageviews' => null,
        'readonly' => null,
        'subwikiid' => null,
        'tags' => null,
        'timecreated' => null,
        'timemodified' => null,
        'timerendered' => null,
        'title' => null,
        'userid' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'cachedcontent' => false,
        'caneditpage' => false,
        'contentformat' => false,
        'contentsize' => false,
        'firstpage' => false,
        'id' => false,
        'pageviews' => false,
        'readonly' => false,
        'subwikiid' => false,
        'tags' => false,
        'timecreated' => false,
        'timemodified' => false,
        'timerendered' => false,
        'title' => false,
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
        'cachedcontent' => 'cachedcontent',
        'caneditpage' => 'caneditpage',
        'contentformat' => 'contentformat',
        'contentsize' => 'contentsize',
        'firstpage' => 'firstpage',
        'id' => 'id',
        'pageviews' => 'pageviews',
        'readonly' => 'readonly',
        'subwikiid' => 'subwikiid',
        'tags' => 'tags',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'timerendered' => 'timerendered',
        'title' => 'title',
        'userid' => 'userid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cachedcontent' => 'setCachedcontent',
        'caneditpage' => 'setCaneditpage',
        'contentformat' => 'setContentformat',
        'contentsize' => 'setContentsize',
        'firstpage' => 'setFirstpage',
        'id' => 'setId',
        'pageviews' => 'setPageviews',
        'readonly' => 'setReadonly',
        'subwikiid' => 'setSubwikiid',
        'tags' => 'setTags',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'timerendered' => 'setTimerendered',
        'title' => 'setTitle',
        'userid' => 'setUserid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cachedcontent' => 'getCachedcontent',
        'caneditpage' => 'getCaneditpage',
        'contentformat' => 'getContentformat',
        'contentsize' => 'getContentsize',
        'firstpage' => 'getFirstpage',
        'id' => 'getId',
        'pageviews' => 'getPageviews',
        'readonly' => 'getReadonly',
        'subwikiid' => 'getSubwikiid',
        'tags' => 'getTags',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'timerendered' => 'getTimerendered',
        'title' => 'getTitle',
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
        $this->setIfExists('cachedcontent', $data ?? [], null);
        $this->setIfExists('caneditpage', $data ?? [], null);
        $this->setIfExists('contentformat', $data ?? [], null);
        $this->setIfExists('contentsize', $data ?? [], null);
        $this->setIfExists('firstpage', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('pageviews', $data ?? [], null);
        $this->setIfExists('readonly', $data ?? [], null);
        $this->setIfExists('subwikiid', $data ?? [], null);
        $this->setIfExists('tags', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], null);
        $this->setIfExists('timemodified', $data ?? [], null);
        $this->setIfExists('timerendered', $data ?? [], null);
        $this->setIfExists('title', $data ?? [], null);
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
     * Gets cachedcontent
     *
     * @return string|null
     */
    public function getCachedcontent()
    {
        return $this->container['cachedcontent'];
    }

    /**
     * Sets cachedcontent
     *
     * @param string|null $cachedcontent Page contents.
     *
     * @return self
     */
    public function setCachedcontent($cachedcontent)
    {
        if (is_null($cachedcontent)) {
            throw new \InvalidArgumentException('non-nullable cachedcontent cannot be null');
        }
        $this->container['cachedcontent'] = $cachedcontent;

        return $this;
    }

    /**
     * Gets caneditpage
     *
     * @return bool|null
     */
    public function getCaneditpage()
    {
        return $this->container['caneditpage'];
    }

    /**
     * Sets caneditpage
     *
     * @param bool|null $caneditpage True if user can edit the page.
     *
     * @return self
     */
    public function setCaneditpage($caneditpage)
    {
        if (is_null($caneditpage)) {
            throw new \InvalidArgumentException('non-nullable caneditpage cannot be null');
        }
        $this->container['caneditpage'] = $caneditpage;

        return $this;
    }

    /**
     * Gets contentformat
     *
     * @return int|null
     */
    public function getContentformat()
    {
        return $this->container['contentformat'];
    }

    /**
     * Sets contentformat
     *
     * @param int|null $contentformat cachedcontent format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setContentformat($contentformat)
    {
        if (is_null($contentformat)) {
            throw new \InvalidArgumentException('non-nullable contentformat cannot be null');
        }
        $this->container['contentformat'] = $contentformat;

        return $this;
    }

    /**
     * Gets contentsize
     *
     * @return int|null
     */
    public function getContentsize()
    {
        return $this->container['contentsize'];
    }

    /**
     * Sets contentsize
     *
     * @param int|null $contentsize Size of page contents in bytes (doesn't include size of attached files).
     *
     * @return self
     */
    public function setContentsize($contentsize)
    {
        if (is_null($contentsize)) {
            throw new \InvalidArgumentException('non-nullable contentsize cannot be null');
        }
        $this->container['contentsize'] = $contentsize;

        return $this;
    }

    /**
     * Gets firstpage
     *
     * @return bool|null
     */
    public function getFirstpage()
    {
        return $this->container['firstpage'];
    }

    /**
     * Sets firstpage
     *
     * @param bool|null $firstpage True if it's the first page.
     *
     * @return self
     */
    public function setFirstpage($firstpage)
    {
        if (is_null($firstpage)) {
            throw new \InvalidArgumentException('non-nullable firstpage cannot be null');
        }
        $this->container['firstpage'] = $firstpage;

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
     * @param int|null $id Page ID.
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
     * Gets pageviews
     *
     * @return int|null
     */
    public function getPageviews()
    {
        return $this->container['pageviews'];
    }

    /**
     * Sets pageviews
     *
     * @param int|null $pageviews Number of times the page has been viewed.
     *
     * @return self
     */
    public function setPageviews($pageviews)
    {
        if (is_null($pageviews)) {
            throw new \InvalidArgumentException('non-nullable pageviews cannot be null');
        }
        $this->container['pageviews'] = $pageviews;

        return $this;
    }

    /**
     * Gets readonly
     *
     * @return int|null
     */
    public function getReadonly()
    {
        return $this->container['readonly'];
    }

    /**
     * Sets readonly
     *
     * @param int|null $readonly 1 if readonly, 0 otherwise.
     *
     * @return self
     */
    public function setReadonly($readonly)
    {
        if (is_null($readonly)) {
            throw new \InvalidArgumentException('non-nullable readonly cannot be null');
        }
        $this->container['readonly'] = $readonly;

        return $this;
    }

    /**
     * Gets subwikiid
     *
     * @return int|null
     */
    public function getSubwikiid()
    {
        return $this->container['subwikiid'];
    }

    /**
     * Sets subwikiid
     *
     * @param int|null $subwikiid Page's subwiki ID.
     *
     * @return self
     */
    public function setSubwikiid($subwikiid)
    {
        if (is_null($subwikiid)) {
            throw new \InvalidArgumentException('non-nullable subwikiid cannot be null');
        }
        $this->container['subwikiid'] = $subwikiid;

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
     * @param int|null $timecreated Time of creation.
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
     * @param int|null $timemodified Time of last modification.
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
     * Gets timerendered
     *
     * @return int|null
     */
    public function getTimerendered()
    {
        return $this->container['timerendered'];
    }

    /**
     * Sets timerendered
     *
     * @param int|null $timerendered Time of last renderization.
     *
     * @return self
     */
    public function setTimerendered($timerendered)
    {
        if (is_null($timerendered)) {
            throw new \InvalidArgumentException('non-nullable timerendered cannot be null');
        }
        $this->container['timerendered'] = $timerendered;

        return $this;
    }

    /**
     * Gets title
     *
     * @return string|null
     */
    public function getTitle()
    {
        return $this->container['title'];
    }

    /**
     * Sets title
     *
     * @param string|null $title Page title.
     *
     * @return self
     */
    public function setTitle($title)
    {
        if (is_null($title)) {
            throw new \InvalidArgumentException('non-nullable title cannot be null');
        }
        $this->container['title'] = $title;

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
     * @param int|null $userid ID of the user that last modified the page.
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

