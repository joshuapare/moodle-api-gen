<?php
/**
 * CoreSearchGetResults200ResponseResultsInner
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
 * CoreSearchGetResults200ResponseResultsInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreSearchGetResults200ResponseResultsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_search_get_results_200_response_results_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'areaname' => 'string',
        'componentname' => 'string',
        'content' => 'string',
        'contextid' => 'int',
        'contexturl' => 'string',
        'coursefullname' => 'string',
        'courseurl' => 'string',
        'description1' => 'string',
        'description2' => 'string',
        'docurl' => 'string',
        'filename' => 'string',
        'filenames' => 'string',
        'iconurl' => 'string',
        'itemid' => 'int',
        'multiplefiles' => 'int',
        'textformat' => 'int',
        'timemodified' => 'int',
        'title' => 'string',
        'userfullname' => 'string',
        'userid' => 'int',
        'userurl' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'areaname' => null,
        'componentname' => null,
        'content' => null,
        'contextid' => null,
        'contexturl' => null,
        'coursefullname' => null,
        'courseurl' => null,
        'description1' => null,
        'description2' => null,
        'docurl' => null,
        'filename' => null,
        'filenames' => null,
        'iconurl' => null,
        'itemid' => null,
        'multiplefiles' => null,
        'textformat' => null,
        'timemodified' => null,
        'title' => null,
        'userfullname' => null,
        'userid' => null,
        'userurl' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'areaname' => false,
        'componentname' => false,
        'content' => false,
        'contextid' => false,
        'contexturl' => false,
        'coursefullname' => false,
        'courseurl' => false,
        'description1' => false,
        'description2' => false,
        'docurl' => false,
        'filename' => false,
        'filenames' => false,
        'iconurl' => false,
        'itemid' => false,
        'multiplefiles' => false,
        'textformat' => false,
        'timemodified' => false,
        'title' => false,
        'userfullname' => false,
        'userid' => false,
        'userurl' => false
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
        'areaname' => 'areaname',
        'componentname' => 'componentname',
        'content' => 'content',
        'contextid' => 'contextid',
        'contexturl' => 'contexturl',
        'coursefullname' => 'coursefullname',
        'courseurl' => 'courseurl',
        'description1' => 'description1',
        'description2' => 'description2',
        'docurl' => 'docurl',
        'filename' => 'filename',
        'filenames' => 'filenames',
        'iconurl' => 'iconurl',
        'itemid' => 'itemid',
        'multiplefiles' => 'multiplefiles',
        'textformat' => 'textformat',
        'timemodified' => 'timemodified',
        'title' => 'title',
        'userfullname' => 'userfullname',
        'userid' => 'userid',
        'userurl' => 'userurl'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'areaname' => 'setAreaname',
        'componentname' => 'setComponentname',
        'content' => 'setContent',
        'contextid' => 'setContextid',
        'contexturl' => 'setContexturl',
        'coursefullname' => 'setCoursefullname',
        'courseurl' => 'setCourseurl',
        'description1' => 'setDescription1',
        'description2' => 'setDescription2',
        'docurl' => 'setDocurl',
        'filename' => 'setFilename',
        'filenames' => 'setFilenames',
        'iconurl' => 'setIconurl',
        'itemid' => 'setItemid',
        'multiplefiles' => 'setMultiplefiles',
        'textformat' => 'setTextformat',
        'timemodified' => 'setTimemodified',
        'title' => 'setTitle',
        'userfullname' => 'setUserfullname',
        'userid' => 'setUserid',
        'userurl' => 'setUserurl'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'areaname' => 'getAreaname',
        'componentname' => 'getComponentname',
        'content' => 'getContent',
        'contextid' => 'getContextid',
        'contexturl' => 'getContexturl',
        'coursefullname' => 'getCoursefullname',
        'courseurl' => 'getCourseurl',
        'description1' => 'getDescription1',
        'description2' => 'getDescription2',
        'docurl' => 'getDocurl',
        'filename' => 'getFilename',
        'filenames' => 'getFilenames',
        'iconurl' => 'getIconurl',
        'itemid' => 'getItemid',
        'multiplefiles' => 'getMultiplefiles',
        'textformat' => 'getTextformat',
        'timemodified' => 'getTimemodified',
        'title' => 'getTitle',
        'userfullname' => 'getUserfullname',
        'userid' => 'getUserid',
        'userurl' => 'getUserurl'
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
        $this->setIfExists('areaname', $data ?? [], 'null');
        $this->setIfExists('componentname', $data ?? [], 'null');
        $this->setIfExists('content', $data ?? [], '');
        $this->setIfExists('contextid', $data ?? [], null);
        $this->setIfExists('contexturl', $data ?? [], 'null');
        $this->setIfExists('coursefullname', $data ?? [], 'null');
        $this->setIfExists('courseurl', $data ?? [], 'null');
        $this->setIfExists('description1', $data ?? [], '');
        $this->setIfExists('description2', $data ?? [], '');
        $this->setIfExists('docurl', $data ?? [], 'null');
        $this->setIfExists('filename', $data ?? [], 'null');
        $this->setIfExists('filenames', $data ?? [], 'null');
        $this->setIfExists('iconurl', $data ?? [], '');
        $this->setIfExists('itemid', $data ?? [], null);
        $this->setIfExists('multiplefiles', $data ?? [], null);
        $this->setIfExists('textformat', $data ?? [], null);
        $this->setIfExists('timemodified', $data ?? [], null);
        $this->setIfExists('title', $data ?? [], 'null');
        $this->setIfExists('userfullname', $data ?? [], 'null');
        $this->setIfExists('userid', $data ?? [], null);
        $this->setIfExists('userurl', $data ?? [], 'null');
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
     * Gets areaname
     *
     * @return string|null
     */
    public function getAreaname()
    {
        return $this->container['areaname'];
    }

    /**
     * Sets areaname
     *
     * @param string|null $areaname search area name
     *
     * @return self
     */
    public function setAreaname($areaname)
    {
        if (is_null($areaname)) {
            throw new \InvalidArgumentException('non-nullable areaname cannot be null');
        }
        $this->container['areaname'] = $areaname;

        return $this;
    }

    /**
     * Gets componentname
     *
     * @return string|null
     */
    public function getComponentname()
    {
        return $this->container['componentname'];
    }

    /**
     * Sets componentname
     *
     * @param string|null $componentname component name
     *
     * @return self
     */
    public function setComponentname($componentname)
    {
        if (is_null($componentname)) {
            throw new \InvalidArgumentException('non-nullable componentname cannot be null');
        }
        $this->container['componentname'] = $componentname;

        return $this;
    }

    /**
     * Gets content
     *
     * @return string|null
     */
    public function getContent()
    {
        return $this->container['content'];
    }

    /**
     * Sets content
     *
     * @param string|null $content result contents
     *
     * @return self
     */
    public function setContent($content)
    {
        if (is_null($content)) {
            throw new \InvalidArgumentException('non-nullable content cannot be null');
        }
        $this->container['content'] = $content;

        return $this;
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
     * @param int|null $contextid result context id
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
     * Gets contexturl
     *
     * @return string|null
     */
    public function getContexturl()
    {
        return $this->container['contexturl'];
    }

    /**
     * Sets contexturl
     *
     * @param string|null $contexturl result context url
     *
     * @return self
     */
    public function setContexturl($contexturl)
    {
        if (is_null($contexturl)) {
            throw new \InvalidArgumentException('non-nullable contexturl cannot be null');
        }
        $this->container['contexturl'] = $contexturl;

        return $this;
    }

    /**
     * Gets coursefullname
     *
     * @return string|null
     */
    public function getCoursefullname()
    {
        return $this->container['coursefullname'];
    }

    /**
     * Sets coursefullname
     *
     * @param string|null $coursefullname result course fullname
     *
     * @return self
     */
    public function setCoursefullname($coursefullname)
    {
        if (is_null($coursefullname)) {
            throw new \InvalidArgumentException('non-nullable coursefullname cannot be null');
        }
        $this->container['coursefullname'] = $coursefullname;

        return $this;
    }

    /**
     * Gets courseurl
     *
     * @return string|null
     */
    public function getCourseurl()
    {
        return $this->container['courseurl'];
    }

    /**
     * Sets courseurl
     *
     * @param string|null $courseurl result course url
     *
     * @return self
     */
    public function setCourseurl($courseurl)
    {
        if (is_null($courseurl)) {
            throw new \InvalidArgumentException('non-nullable courseurl cannot be null');
        }
        $this->container['courseurl'] = $courseurl;

        return $this;
    }

    /**
     * Gets description1
     *
     * @return string|null
     */
    public function getDescription1()
    {
        return $this->container['description1'];
    }

    /**
     * Sets description1
     *
     * @param string|null $description1 extra result contents, depends on the search area
     *
     * @return self
     */
    public function setDescription1($description1)
    {
        if (is_null($description1)) {
            throw new \InvalidArgumentException('non-nullable description1 cannot be null');
        }
        $this->container['description1'] = $description1;

        return $this;
    }

    /**
     * Gets description2
     *
     * @return string|null
     */
    public function getDescription2()
    {
        return $this->container['description2'];
    }

    /**
     * Sets description2
     *
     * @param string|null $description2 extra result contents, depends on the search area
     *
     * @return self
     */
    public function setDescription2($description2)
    {
        if (is_null($description2)) {
            throw new \InvalidArgumentException('non-nullable description2 cannot be null');
        }
        $this->container['description2'] = $description2;

        return $this;
    }

    /**
     * Gets docurl
     *
     * @return string|null
     */
    public function getDocurl()
    {
        return $this->container['docurl'];
    }

    /**
     * Sets docurl
     *
     * @param string|null $docurl result url
     *
     * @return self
     */
    public function setDocurl($docurl)
    {
        if (is_null($docurl)) {
            throw new \InvalidArgumentException('non-nullable docurl cannot be null');
        }
        $this->container['docurl'] = $docurl;

        return $this;
    }

    /**
     * Gets filename
     *
     * @return string|null
     */
    public function getFilename()
    {
        return $this->container['filename'];
    }

    /**
     * Sets filename
     *
     * @param string|null $filename result file name if present
     *
     * @return self
     */
    public function setFilename($filename)
    {
        if (is_null($filename)) {
            throw new \InvalidArgumentException('non-nullable filename cannot be null');
        }
        $this->container['filename'] = $filename;

        return $this;
    }

    /**
     * Gets filenames
     *
     * @return string|null
     */
    public function getFilenames()
    {
        return $this->container['filenames'];
    }

    /**
     * Sets filenames
     *
     * @param string|null $filenames result file names if present
     *
     * @return self
     */
    public function setFilenames($filenames)
    {
        if (is_null($filenames)) {
            throw new \InvalidArgumentException('non-nullable filenames cannot be null');
        }
        $this->container['filenames'] = $filenames;

        return $this;
    }

    /**
     * Gets iconurl
     *
     * @return string|null
     */
    public function getIconurl()
    {
        return $this->container['iconurl'];
    }

    /**
     * Sets iconurl
     *
     * @param string|null $iconurl icon url
     *
     * @return self
     */
    public function setIconurl($iconurl)
    {
        if (is_null($iconurl)) {
            throw new \InvalidArgumentException('non-nullable iconurl cannot be null');
        }
        $this->container['iconurl'] = $iconurl;

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
     * @param int|null $itemid unique id in the search area scope
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
     * Gets multiplefiles
     *
     * @return int|null
     */
    public function getMultiplefiles()
    {
        return $this->container['multiplefiles'];
    }

    /**
     * Sets multiplefiles
     *
     * @param int|null $multiplefiles whether multiple files are returned or not
     *
     * @return self
     */
    public function setMultiplefiles($multiplefiles)
    {
        if (is_null($multiplefiles)) {
            throw new \InvalidArgumentException('non-nullable multiplefiles cannot be null');
        }
        $this->container['multiplefiles'] = $multiplefiles;

        return $this;
    }

    /**
     * Gets textformat
     *
     * @return int|null
     */
    public function getTextformat()
    {
        return $this->container['textformat'];
    }

    /**
     * Sets textformat
     *
     * @param int|null $textformat text fields format, it is the same for all of them
     *
     * @return self
     */
    public function setTextformat($textformat)
    {
        if (is_null($textformat)) {
            throw new \InvalidArgumentException('non-nullable textformat cannot be null');
        }
        $this->container['textformat'] = $textformat;

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
     * @param int|null $timemodified result modified time
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
     * @param string|null $title result title
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
     * Gets userfullname
     *
     * @return string|null
     */
    public function getUserfullname()
    {
        return $this->container['userfullname'];
    }

    /**
     * Sets userfullname
     *
     * @param string|null $userfullname user fullname
     *
     * @return self
     */
    public function setUserfullname($userfullname)
    {
        if (is_null($userfullname)) {
            throw new \InvalidArgumentException('non-nullable userfullname cannot be null');
        }
        $this->container['userfullname'] = $userfullname;

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
     * @param int|null $userid user id
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
     * Gets userurl
     *
     * @return string|null
     */
    public function getUserurl()
    {
        return $this->container['userurl'];
    }

    /**
     * Sets userurl
     *
     * @param string|null $userurl user url
     *
     * @return self
     */
    public function setUserurl($userurl)
    {
        if (is_null($userurl)) {
            throw new \InvalidArgumentException('non-nullable userurl cannot be null');
        }
        $this->container['userurl'] = $userurl;

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

