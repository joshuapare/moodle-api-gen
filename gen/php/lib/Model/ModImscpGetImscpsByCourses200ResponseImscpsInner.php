<?php
/**
 * ModImscpGetImscpsByCourses200ResponseImscpsInner
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
 * ModImscpGetImscpsByCourses200ResponseImscpsInner Class Doc Comment
 *
 * @category Class
 * @description IMS content packages
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModImscpGetImscpsByCourses200ResponseImscpsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_imscp_get_imscps_by_courses_200_response_imscps_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'course' => 'int',
        'coursemodule' => 'int',
        'groupingid' => 'int',
        'groupmode' => 'int',
        'id' => 'int',
        'intro' => 'string',
        'introfiles' => '\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]',
        'introformat' => 'int',
        'keepold' => 'int',
        'lang' => 'string',
        'name' => 'string',
        'revision' => 'int',
        'section' => 'int',
        'structure' => 'string',
        'timemodified' => 'string',
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
        'course' => null,
        'coursemodule' => null,
        'groupingid' => null,
        'groupmode' => null,
        'id' => null,
        'intro' => null,
        'introfiles' => null,
        'introformat' => null,
        'keepold' => null,
        'lang' => null,
        'name' => null,
        'revision' => null,
        'section' => null,
        'structure' => null,
        'timemodified' => null,
        'visible' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'course' => false,
        'coursemodule' => false,
        'groupingid' => false,
        'groupmode' => false,
        'id' => false,
        'intro' => false,
        'introfiles' => false,
        'introformat' => false,
        'keepold' => false,
        'lang' => false,
        'name' => false,
        'revision' => false,
        'section' => false,
        'structure' => false,
        'timemodified' => false,
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
        'course' => 'course',
        'coursemodule' => 'coursemodule',
        'groupingid' => 'groupingid',
        'groupmode' => 'groupmode',
        'id' => 'id',
        'intro' => 'intro',
        'introfiles' => 'introfiles',
        'introformat' => 'introformat',
        'keepold' => 'keepold',
        'lang' => 'lang',
        'name' => 'name',
        'revision' => 'revision',
        'section' => 'section',
        'structure' => 'structure',
        'timemodified' => 'timemodified',
        'visible' => 'visible'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'course' => 'setCourse',
        'coursemodule' => 'setCoursemodule',
        'groupingid' => 'setGroupingid',
        'groupmode' => 'setGroupmode',
        'id' => 'setId',
        'intro' => 'setIntro',
        'introfiles' => 'setIntrofiles',
        'introformat' => 'setIntroformat',
        'keepold' => 'setKeepold',
        'lang' => 'setLang',
        'name' => 'setName',
        'revision' => 'setRevision',
        'section' => 'setSection',
        'structure' => 'setStructure',
        'timemodified' => 'setTimemodified',
        'visible' => 'setVisible'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'course' => 'getCourse',
        'coursemodule' => 'getCoursemodule',
        'groupingid' => 'getGroupingid',
        'groupmode' => 'getGroupmode',
        'id' => 'getId',
        'intro' => 'getIntro',
        'introfiles' => 'getIntrofiles',
        'introformat' => 'getIntroformat',
        'keepold' => 'getKeepold',
        'lang' => 'getLang',
        'name' => 'getName',
        'revision' => 'getRevision',
        'section' => 'getSection',
        'structure' => 'getStructure',
        'timemodified' => 'getTimemodified',
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
        $this->setIfExists('course', $data ?? [], null);
        $this->setIfExists('coursemodule', $data ?? [], null);
        $this->setIfExists('groupingid', $data ?? [], null);
        $this->setIfExists('groupmode', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('intro', $data ?? [], null);
        $this->setIfExists('introfiles', $data ?? [], null);
        $this->setIfExists('introformat', $data ?? [], null);
        $this->setIfExists('keepold', $data ?? [], null);
        $this->setIfExists('lang', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('revision', $data ?? [], null);
        $this->setIfExists('section', $data ?? [], null);
        $this->setIfExists('structure', $data ?? [], 'null');
        $this->setIfExists('timemodified', $data ?? [], 'null');
        $this->setIfExists('visible', $data ?? [], null);
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
     * Gets course
     *
     * @return int|null
     */
    public function getCourse()
    {
        return $this->container['course'];
    }

    /**
     * Sets course
     *
     * @param int|null $course Course id
     *
     * @return self
     */
    public function setCourse($course)
    {
        if (is_null($course)) {
            throw new \InvalidArgumentException('non-nullable course cannot be null');
        }
        $this->container['course'] = $course;

        return $this;
    }

    /**
     * Gets coursemodule
     *
     * @return int|null
     */
    public function getCoursemodule()
    {
        return $this->container['coursemodule'];
    }

    /**
     * Sets coursemodule
     *
     * @param int|null $coursemodule Course module id
     *
     * @return self
     */
    public function setCoursemodule($coursemodule)
    {
        if (is_null($coursemodule)) {
            throw new \InvalidArgumentException('non-nullable coursemodule cannot be null');
        }
        $this->container['coursemodule'] = $coursemodule;

        return $this;
    }

    /**
     * Gets groupingid
     *
     * @return int|null
     */
    public function getGroupingid()
    {
        return $this->container['groupingid'];
    }

    /**
     * Sets groupingid
     *
     * @param int|null $groupingid Group id
     *
     * @return self
     */
    public function setGroupingid($groupingid)
    {
        if (is_null($groupingid)) {
            throw new \InvalidArgumentException('non-nullable groupingid cannot be null');
        }
        $this->container['groupingid'] = $groupingid;

        return $this;
    }

    /**
     * Gets groupmode
     *
     * @return int|null
     */
    public function getGroupmode()
    {
        return $this->container['groupmode'];
    }

    /**
     * Sets groupmode
     *
     * @param int|null $groupmode Group mode
     *
     * @return self
     */
    public function setGroupmode($groupmode)
    {
        if (is_null($groupmode)) {
            throw new \InvalidArgumentException('non-nullable groupmode cannot be null');
        }
        $this->container['groupmode'] = $groupmode;

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
     * @param int|null $id Activity instance id
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
     * Gets intro
     *
     * @return string|null
     */
    public function getIntro()
    {
        return $this->container['intro'];
    }

    /**
     * Sets intro
     *
     * @param string|null $intro Activity introduction
     *
     * @return self
     */
    public function setIntro($intro)
    {
        if (is_null($intro)) {
            throw new \InvalidArgumentException('non-nullable intro cannot be null');
        }
        $this->container['intro'] = $intro;

        return $this;
    }

    /**
     * Gets introfiles
     *
     * @return \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null
     */
    public function getIntrofiles()
    {
        return $this->container['introfiles'];
    }

    /**
     * Sets introfiles
     *
     * @param \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null $introfiles introfiles
     *
     * @return self
     */
    public function setIntrofiles($introfiles)
    {
        if (is_null($introfiles)) {
            throw new \InvalidArgumentException('non-nullable introfiles cannot be null');
        }
        $this->container['introfiles'] = $introfiles;

        return $this;
    }

    /**
     * Gets introformat
     *
     * @return int|null
     */
    public function getIntroformat()
    {
        return $this->container['introformat'];
    }

    /**
     * Sets introformat
     *
     * @param int|null $introformat intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setIntroformat($introformat)
    {
        if (is_null($introformat)) {
            throw new \InvalidArgumentException('non-nullable introformat cannot be null');
        }
        $this->container['introformat'] = $introformat;

        return $this;
    }

    /**
     * Gets keepold
     *
     * @return int|null
     */
    public function getKeepold()
    {
        return $this->container['keepold'];
    }

    /**
     * Sets keepold
     *
     * @param int|null $keepold Number of old IMSCP to keep
     *
     * @return self
     */
    public function setKeepold($keepold)
    {
        if (is_null($keepold)) {
            throw new \InvalidArgumentException('non-nullable keepold cannot be null');
        }
        $this->container['keepold'] = $keepold;

        return $this;
    }

    /**
     * Gets lang
     *
     * @return string|null
     */
    public function getLang()
    {
        return $this->container['lang'];
    }

    /**
     * Sets lang
     *
     * @param string|null $lang Forced activity language
     *
     * @return self
     */
    public function setLang($lang)
    {
        if (is_null($lang)) {
            throw new \InvalidArgumentException('non-nullable lang cannot be null');
        }
        $this->container['lang'] = $lang;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string|null $name Activity name
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
     * Gets revision
     *
     * @return int|null
     */
    public function getRevision()
    {
        return $this->container['revision'];
    }

    /**
     * Sets revision
     *
     * @param int|null $revision Revision
     *
     * @return self
     */
    public function setRevision($revision)
    {
        if (is_null($revision)) {
            throw new \InvalidArgumentException('non-nullable revision cannot be null');
        }
        $this->container['revision'] = $revision;

        return $this;
    }

    /**
     * Gets section
     *
     * @return int|null
     */
    public function getSection()
    {
        return $this->container['section'];
    }

    /**
     * Sets section
     *
     * @param int|null $section Course section id
     *
     * @return self
     */
    public function setSection($section)
    {
        if (is_null($section)) {
            throw new \InvalidArgumentException('non-nullable section cannot be null');
        }
        $this->container['section'] = $section;

        return $this;
    }

    /**
     * Gets structure
     *
     * @return string|null
     */
    public function getStructure()
    {
        return $this->container['structure'];
    }

    /**
     * Sets structure
     *
     * @param string|null $structure IMSCP structure
     *
     * @return self
     */
    public function setStructure($structure)
    {
        if (is_null($structure)) {
            throw new \InvalidArgumentException('non-nullable structure cannot be null');
        }
        $this->container['structure'] = $structure;

        return $this;
    }

    /**
     * Gets timemodified
     *
     * @return string|null
     */
    public function getTimemodified()
    {
        return $this->container['timemodified'];
    }

    /**
     * Sets timemodified
     *
     * @param string|null $timemodified Time of last modification
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
     * @param bool|null $visible Visible
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


