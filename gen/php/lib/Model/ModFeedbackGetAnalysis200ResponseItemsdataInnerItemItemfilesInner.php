<?php
/**
 * ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner
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
 * ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_feedback_get_analysis_200_response_itemsdata_inner_item_itemfiles_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'author' => 'string',
        'component' => 'string',
        'contextid' => 'int',
        'filearea' => 'string',
        'filename' => 'string',
        'filenameshort' => 'string',
        'filepath' => 'string',
        'filesize' => 'int',
        'filesizeformatted' => 'string',
        'icon' => 'string',
        'isdir' => 'bool',
        'isimage' => 'bool',
        'itemid' => 'int',
        'license' => 'string',
        'timecreated' => 'int',
        'timecreatedformatted' => 'string',
        'timemodified' => 'int',
        'timemodifiedformatted' => 'string',
        'url' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'author' => null,
        'component' => null,
        'contextid' => null,
        'filearea' => null,
        'filename' => null,
        'filenameshort' => null,
        'filepath' => null,
        'filesize' => null,
        'filesizeformatted' => null,
        'icon' => null,
        'isdir' => null,
        'isimage' => null,
        'itemid' => null,
        'license' => null,
        'timecreated' => null,
        'timecreatedformatted' => null,
        'timemodified' => null,
        'timemodifiedformatted' => null,
        'url' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'author' => false,
        'component' => false,
        'contextid' => false,
        'filearea' => false,
        'filename' => false,
        'filenameshort' => false,
        'filepath' => false,
        'filesize' => false,
        'filesizeformatted' => false,
        'icon' => false,
        'isdir' => false,
        'isimage' => false,
        'itemid' => false,
        'license' => false,
        'timecreated' => false,
        'timecreatedformatted' => false,
        'timemodified' => false,
        'timemodifiedformatted' => false,
        'url' => false
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
        'author' => 'author',
        'component' => 'component',
        'contextid' => 'contextid',
        'filearea' => 'filearea',
        'filename' => 'filename',
        'filenameshort' => 'filenameshort',
        'filepath' => 'filepath',
        'filesize' => 'filesize',
        'filesizeformatted' => 'filesizeformatted',
        'icon' => 'icon',
        'isdir' => 'isdir',
        'isimage' => 'isimage',
        'itemid' => 'itemid',
        'license' => 'license',
        'timecreated' => 'timecreated',
        'timecreatedformatted' => 'timecreatedformatted',
        'timemodified' => 'timemodified',
        'timemodifiedformatted' => 'timemodifiedformatted',
        'url' => 'url'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'author' => 'setAuthor',
        'component' => 'setComponent',
        'contextid' => 'setContextid',
        'filearea' => 'setFilearea',
        'filename' => 'setFilename',
        'filenameshort' => 'setFilenameshort',
        'filepath' => 'setFilepath',
        'filesize' => 'setFilesize',
        'filesizeformatted' => 'setFilesizeformatted',
        'icon' => 'setIcon',
        'isdir' => 'setIsdir',
        'isimage' => 'setIsimage',
        'itemid' => 'setItemid',
        'license' => 'setLicense',
        'timecreated' => 'setTimecreated',
        'timecreatedformatted' => 'setTimecreatedformatted',
        'timemodified' => 'setTimemodified',
        'timemodifiedformatted' => 'setTimemodifiedformatted',
        'url' => 'setUrl'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'author' => 'getAuthor',
        'component' => 'getComponent',
        'contextid' => 'getContextid',
        'filearea' => 'getFilearea',
        'filename' => 'getFilename',
        'filenameshort' => 'getFilenameshort',
        'filepath' => 'getFilepath',
        'filesize' => 'getFilesize',
        'filesizeformatted' => 'getFilesizeformatted',
        'icon' => 'getIcon',
        'isdir' => 'getIsdir',
        'isimage' => 'getIsimage',
        'itemid' => 'getItemid',
        'license' => 'getLicense',
        'timecreated' => 'getTimecreated',
        'timecreatedformatted' => 'getTimecreatedformatted',
        'timemodified' => 'getTimemodified',
        'timemodifiedformatted' => 'getTimemodifiedformatted',
        'url' => 'getUrl'
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
        $this->setIfExists('author', $data ?? [], null);
        $this->setIfExists('component', $data ?? [], null);
        $this->setIfExists('contextid', $data ?? [], null);
        $this->setIfExists('filearea', $data ?? [], null);
        $this->setIfExists('filename', $data ?? [], null);
        $this->setIfExists('filenameshort', $data ?? [], null);
        $this->setIfExists('filepath', $data ?? [], null);
        $this->setIfExists('filesize', $data ?? [], null);
        $this->setIfExists('filesizeformatted', $data ?? [], null);
        $this->setIfExists('icon', $data ?? [], null);
        $this->setIfExists('isdir', $data ?? [], null);
        $this->setIfExists('isimage', $data ?? [], null);
        $this->setIfExists('itemid', $data ?? [], null);
        $this->setIfExists('license', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], null);
        $this->setIfExists('timecreatedformatted', $data ?? [], null);
        $this->setIfExists('timemodified', $data ?? [], null);
        $this->setIfExists('timemodifiedformatted', $data ?? [], null);
        $this->setIfExists('url', $data ?? [], null);
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
     * Gets author
     *
     * @return string|null
     */
    public function getAuthor()
    {
        return $this->container['author'];
    }

    /**
     * Sets author
     *
     * @param string|null $author author
     *
     * @return self
     */
    public function setAuthor($author)
    {
        if (is_null($author)) {
            throw new \InvalidArgumentException('non-nullable author cannot be null');
        }
        $this->container['author'] = $author;

        return $this;
    }

    /**
     * Gets component
     *
     * @return string|null
     */
    public function getComponent()
    {
        return $this->container['component'];
    }

    /**
     * Sets component
     *
     * @param string|null $component component
     *
     * @return self
     */
    public function setComponent($component)
    {
        if (is_null($component)) {
            throw new \InvalidArgumentException('non-nullable component cannot be null');
        }
        $this->container['component'] = $component;

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
     * @param int|null $contextid contextid
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
     * Gets filearea
     *
     * @return string|null
     */
    public function getFilearea()
    {
        return $this->container['filearea'];
    }

    /**
     * Sets filearea
     *
     * @param string|null $filearea filearea
     *
     * @return self
     */
    public function setFilearea($filearea)
    {
        if (is_null($filearea)) {
            throw new \InvalidArgumentException('non-nullable filearea cannot be null');
        }
        $this->container['filearea'] = $filearea;

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
     * @param string|null $filename filename
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
     * Gets filenameshort
     *
     * @return string|null
     */
    public function getFilenameshort()
    {
        return $this->container['filenameshort'];
    }

    /**
     * Sets filenameshort
     *
     * @param string|null $filenameshort filenameshort
     *
     * @return self
     */
    public function setFilenameshort($filenameshort)
    {
        if (is_null($filenameshort)) {
            throw new \InvalidArgumentException('non-nullable filenameshort cannot be null');
        }
        $this->container['filenameshort'] = $filenameshort;

        return $this;
    }

    /**
     * Gets filepath
     *
     * @return string|null
     */
    public function getFilepath()
    {
        return $this->container['filepath'];
    }

    /**
     * Sets filepath
     *
     * @param string|null $filepath filepath
     *
     * @return self
     */
    public function setFilepath($filepath)
    {
        if (is_null($filepath)) {
            throw new \InvalidArgumentException('non-nullable filepath cannot be null');
        }
        $this->container['filepath'] = $filepath;

        return $this;
    }

    /**
     * Gets filesize
     *
     * @return int|null
     */
    public function getFilesize()
    {
        return $this->container['filesize'];
    }

    /**
     * Sets filesize
     *
     * @param int|null $filesize filesize
     *
     * @return self
     */
    public function setFilesize($filesize)
    {
        if (is_null($filesize)) {
            throw new \InvalidArgumentException('non-nullable filesize cannot be null');
        }
        $this->container['filesize'] = $filesize;

        return $this;
    }

    /**
     * Gets filesizeformatted
     *
     * @return string|null
     */
    public function getFilesizeformatted()
    {
        return $this->container['filesizeformatted'];
    }

    /**
     * Sets filesizeformatted
     *
     * @param string|null $filesizeformatted filesizeformatted
     *
     * @return self
     */
    public function setFilesizeformatted($filesizeformatted)
    {
        if (is_null($filesizeformatted)) {
            throw new \InvalidArgumentException('non-nullable filesizeformatted cannot be null');
        }
        $this->container['filesizeformatted'] = $filesizeformatted;

        return $this;
    }

    /**
     * Gets icon
     *
     * @return string|null
     */
    public function getIcon()
    {
        return $this->container['icon'];
    }

    /**
     * Sets icon
     *
     * @param string|null $icon icon
     *
     * @return self
     */
    public function setIcon($icon)
    {
        if (is_null($icon)) {
            throw new \InvalidArgumentException('non-nullable icon cannot be null');
        }
        $this->container['icon'] = $icon;

        return $this;
    }

    /**
     * Gets isdir
     *
     * @return bool|null
     */
    public function getIsdir()
    {
        return $this->container['isdir'];
    }

    /**
     * Sets isdir
     *
     * @param bool|null $isdir isdir
     *
     * @return self
     */
    public function setIsdir($isdir)
    {
        if (is_null($isdir)) {
            throw new \InvalidArgumentException('non-nullable isdir cannot be null');
        }
        $this->container['isdir'] = $isdir;

        return $this;
    }

    /**
     * Gets isimage
     *
     * @return bool|null
     */
    public function getIsimage()
    {
        return $this->container['isimage'];
    }

    /**
     * Sets isimage
     *
     * @param bool|null $isimage isimage
     *
     * @return self
     */
    public function setIsimage($isimage)
    {
        if (is_null($isimage)) {
            throw new \InvalidArgumentException('non-nullable isimage cannot be null');
        }
        $this->container['isimage'] = $isimage;

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
     * @param int|null $itemid itemid
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
     * Gets license
     *
     * @return string|null
     */
    public function getLicense()
    {
        return $this->container['license'];
    }

    /**
     * Sets license
     *
     * @param string|null $license license
     *
     * @return self
     */
    public function setLicense($license)
    {
        if (is_null($license)) {
            throw new \InvalidArgumentException('non-nullable license cannot be null');
        }
        $this->container['license'] = $license;

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
     * Gets timecreatedformatted
     *
     * @return string|null
     */
    public function getTimecreatedformatted()
    {
        return $this->container['timecreatedformatted'];
    }

    /**
     * Sets timecreatedformatted
     *
     * @param string|null $timecreatedformatted timecreatedformatted
     *
     * @return self
     */
    public function setTimecreatedformatted($timecreatedformatted)
    {
        if (is_null($timecreatedformatted)) {
            throw new \InvalidArgumentException('non-nullable timecreatedformatted cannot be null');
        }
        $this->container['timecreatedformatted'] = $timecreatedformatted;

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
     * Gets timemodifiedformatted
     *
     * @return string|null
     */
    public function getTimemodifiedformatted()
    {
        return $this->container['timemodifiedformatted'];
    }

    /**
     * Sets timemodifiedformatted
     *
     * @param string|null $timemodifiedformatted timemodifiedformatted
     *
     * @return self
     */
    public function setTimemodifiedformatted($timemodifiedformatted)
    {
        if (is_null($timemodifiedformatted)) {
            throw new \InvalidArgumentException('non-nullable timemodifiedformatted cannot be null');
        }
        $this->container['timemodifiedformatted'] = $timemodifiedformatted;

        return $this;
    }

    /**
     * Gets url
     *
     * @return string|null
     */
    public function getUrl()
    {
        return $this->container['url'];
    }

    /**
     * Sets url
     *
     * @param string|null $url url
     *
     * @return self
     */
    public function setUrl($url)
    {
        if (is_null($url)) {
            throw new \InvalidArgumentException('non-nullable url cannot be null');
        }
        $this->container['url'] = $url;

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

