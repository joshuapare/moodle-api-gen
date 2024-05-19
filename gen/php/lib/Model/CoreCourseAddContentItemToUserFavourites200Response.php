<?php
/**
 * CoreCourseAddContentItemToUserFavourites200Response
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
 * CoreCourseAddContentItemToUserFavourites200Response Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCourseAddContentItemToUserFavourites200Response implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_course_add_content_item_to_user_favourites_200_response';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'archetype' => 'string',
        'componentname' => 'string',
        'favourite' => 'bool',
        'help' => 'string',
        'icon' => 'string',
        'id' => 'int',
        'legacyitem' => 'bool',
        'link' => 'string',
        'name' => 'string',
        'purpose' => 'string',
        'recommended' => 'bool',
        'title' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'archetype' => null,
        'componentname' => null,
        'favourite' => null,
        'help' => null,
        'icon' => null,
        'id' => null,
        'legacyitem' => null,
        'link' => null,
        'name' => null,
        'purpose' => null,
        'recommended' => null,
        'title' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'archetype' => false,
        'componentname' => false,
        'favourite' => false,
        'help' => false,
        'icon' => false,
        'id' => false,
        'legacyitem' => false,
        'link' => false,
        'name' => false,
        'purpose' => false,
        'recommended' => false,
        'title' => false
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
        'archetype' => 'archetype',
        'componentname' => 'componentname',
        'favourite' => 'favourite',
        'help' => 'help',
        'icon' => 'icon',
        'id' => 'id',
        'legacyitem' => 'legacyitem',
        'link' => 'link',
        'name' => 'name',
        'purpose' => 'purpose',
        'recommended' => 'recommended',
        'title' => 'title'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'archetype' => 'setArchetype',
        'componentname' => 'setComponentname',
        'favourite' => 'setFavourite',
        'help' => 'setHelp',
        'icon' => 'setIcon',
        'id' => 'setId',
        'legacyitem' => 'setLegacyitem',
        'link' => 'setLink',
        'name' => 'setName',
        'purpose' => 'setPurpose',
        'recommended' => 'setRecommended',
        'title' => 'setTitle'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'archetype' => 'getArchetype',
        'componentname' => 'getComponentname',
        'favourite' => 'getFavourite',
        'help' => 'getHelp',
        'icon' => 'getIcon',
        'id' => 'getId',
        'legacyitem' => 'getLegacyitem',
        'link' => 'getLink',
        'name' => 'getName',
        'purpose' => 'getPurpose',
        'recommended' => 'getRecommended',
        'title' => 'getTitle'
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
        $this->setIfExists('archetype', $data ?? [], 'null');
        $this->setIfExists('componentname', $data ?? [], 'null');
        $this->setIfExists('favourite', $data ?? [], null);
        $this->setIfExists('help', $data ?? [], 'null');
        $this->setIfExists('icon', $data ?? [], 'null');
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('legacyitem', $data ?? [], null);
        $this->setIfExists('link', $data ?? [], 'null');
        $this->setIfExists('name', $data ?? [], 'null');
        $this->setIfExists('purpose', $data ?? [], 'null');
        $this->setIfExists('recommended', $data ?? [], null);
        $this->setIfExists('title', $data ?? [], 'null');
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

        if ($this->container['archetype'] === null) {
            $invalidProperties[] = "'archetype' can't be null";
        }
        if ($this->container['componentname'] === null) {
            $invalidProperties[] = "'componentname' can't be null";
        }
        if ($this->container['favourite'] === null) {
            $invalidProperties[] = "'favourite' can't be null";
        }
        if ($this->container['help'] === null) {
            $invalidProperties[] = "'help' can't be null";
        }
        if ($this->container['icon'] === null) {
            $invalidProperties[] = "'icon' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['legacyitem'] === null) {
            $invalidProperties[] = "'legacyitem' can't be null";
        }
        if ($this->container['link'] === null) {
            $invalidProperties[] = "'link' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['purpose'] === null) {
            $invalidProperties[] = "'purpose' can't be null";
        }
        if ($this->container['recommended'] === null) {
            $invalidProperties[] = "'recommended' can't be null";
        }
        if ($this->container['title'] === null) {
            $invalidProperties[] = "'title' can't be null";
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
     * Gets archetype
     *
     * @return string
     */
    public function getArchetype()
    {
        return $this->container['archetype'];
    }

    /**
     * Sets archetype
     *
     * @param string $archetype The archetype of the module exposing the content item
     *
     * @return self
     */
    public function setArchetype($archetype)
    {
        if (is_null($archetype)) {
            throw new \InvalidArgumentException('non-nullable archetype cannot be null');
        }
        $this->container['archetype'] = $archetype;

        return $this;
    }

    /**
     * Gets componentname
     *
     * @return string
     */
    public function getComponentname()
    {
        return $this->container['componentname'];
    }

    /**
     * Sets componentname
     *
     * @param string $componentname The name of the component exposing the content item
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
     * Gets favourite
     *
     * @return bool
     */
    public function getFavourite()
    {
        return $this->container['favourite'];
    }

    /**
     * Sets favourite
     *
     * @param bool $favourite Has the user favourited the content item
     *
     * @return self
     */
    public function setFavourite($favourite)
    {
        if (is_null($favourite)) {
            throw new \InvalidArgumentException('non-nullable favourite cannot be null');
        }
        $this->container['favourite'] = $favourite;

        return $this;
    }

    /**
     * Gets help
     *
     * @return string
     */
    public function getHelp()
    {
        return $this->container['help'];
    }

    /**
     * Sets help
     *
     * @param string $help Html description / help for the content item
     *
     * @return self
     */
    public function setHelp($help)
    {
        if (is_null($help)) {
            throw new \InvalidArgumentException('non-nullable help cannot be null');
        }
        $this->container['help'] = $help;

        return $this;
    }

    /**
     * Gets icon
     *
     * @return string
     */
    public function getIcon()
    {
        return $this->container['icon'];
    }

    /**
     * Sets icon
     *
     * @param string $icon Html containing the icon for the content item
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
     * Gets id
     *
     * @return int
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int $id The id of the content item
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
     * Gets legacyitem
     *
     * @return bool
     */
    public function getLegacyitem()
    {
        return $this->container['legacyitem'];
    }

    /**
     * Sets legacyitem
     *
     * @param bool $legacyitem If this item was pulled from the old callback and has no item id.
     *
     * @return self
     */
    public function setLegacyitem($legacyitem)
    {
        if (is_null($legacyitem)) {
            throw new \InvalidArgumentException('non-nullable legacyitem cannot be null');
        }
        $this->container['legacyitem'] = $legacyitem;

        return $this;
    }

    /**
     * Gets link
     *
     * @return string
     */
    public function getLink()
    {
        return $this->container['link'];
    }

    /**
     * Sets link
     *
     * @param string $link The link to the content item creation page
     *
     * @return self
     */
    public function setLink($link)
    {
        if (is_null($link)) {
            throw new \InvalidArgumentException('non-nullable link cannot be null');
        }
        $this->container['link'] = $link;

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
     * @param string $name Name of the content item
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
     * Gets purpose
     *
     * @return string
     */
    public function getPurpose()
    {
        return $this->container['purpose'];
    }

    /**
     * Sets purpose
     *
     * @param string $purpose The purpose of the component exposing the content item
     *
     * @return self
     */
    public function setPurpose($purpose)
    {
        if (is_null($purpose)) {
            throw new \InvalidArgumentException('non-nullable purpose cannot be null');
        }
        $this->container['purpose'] = $purpose;

        return $this;
    }

    /**
     * Gets recommended
     *
     * @return bool
     */
    public function getRecommended()
    {
        return $this->container['recommended'];
    }

    /**
     * Sets recommended
     *
     * @param bool $recommended Has this item been recommended
     *
     * @return self
     */
    public function setRecommended($recommended)
    {
        if (is_null($recommended)) {
            throw new \InvalidArgumentException('non-nullable recommended cannot be null');
        }
        $this->container['recommended'] = $recommended;

        return $this;
    }

    /**
     * Gets title
     *
     * @return string
     */
    public function getTitle()
    {
        return $this->container['title'];
    }

    /**
     * Sets title
     *
     * @param string $title The string title of the content item, human readable
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


