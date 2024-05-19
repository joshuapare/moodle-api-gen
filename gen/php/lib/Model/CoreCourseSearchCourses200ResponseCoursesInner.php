<?php
/**
 * CoreCourseSearchCourses200ResponseCoursesInner
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
 * CoreCourseSearchCourses200ResponseCoursesInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCourseSearchCourses200ResponseCoursesInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_course_search_courses_200_response_courses_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'categoryid' => 'int',
        'categoryname' => 'string',
        'contacts' => '\OpenAPI\Client\Model\CoreCourseSearchCourses200ResponseCoursesInnerContactsInner[]',
        'courseimage' => 'string',
        'customfields' => '\OpenAPI\Client\Model\CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner[]',
        'displayname' => 'string',
        'enrollmentmethods' => 'object[]',
        'fullname' => 'string',
        'id' => 'int',
        'overviewfiles' => '\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]',
        'shortname' => 'string',
        'showactivitydates' => 'bool',
        'showcompletionconditions' => 'bool',
        'sortorder' => 'int',
        'summary' => 'string',
        'summaryfiles' => '\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]',
        'summaryformat' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'categoryid' => null,
        'categoryname' => null,
        'contacts' => null,
        'courseimage' => null,
        'customfields' => null,
        'displayname' => null,
        'enrollmentmethods' => null,
        'fullname' => null,
        'id' => null,
        'overviewfiles' => null,
        'shortname' => null,
        'showactivitydates' => null,
        'showcompletionconditions' => null,
        'sortorder' => null,
        'summary' => null,
        'summaryfiles' => null,
        'summaryformat' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'categoryid' => false,
        'categoryname' => false,
        'contacts' => false,
        'courseimage' => false,
        'customfields' => false,
        'displayname' => false,
        'enrollmentmethods' => false,
        'fullname' => false,
        'id' => false,
        'overviewfiles' => false,
        'shortname' => false,
        'showactivitydates' => false,
        'showcompletionconditions' => false,
        'sortorder' => false,
        'summary' => false,
        'summaryfiles' => false,
        'summaryformat' => false
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
        'categoryid' => 'categoryid',
        'categoryname' => 'categoryname',
        'contacts' => 'contacts',
        'courseimage' => 'courseimage',
        'customfields' => 'customfields',
        'displayname' => 'displayname',
        'enrollmentmethods' => 'enrollmentmethods',
        'fullname' => 'fullname',
        'id' => 'id',
        'overviewfiles' => 'overviewfiles',
        'shortname' => 'shortname',
        'showactivitydates' => 'showactivitydates',
        'showcompletionconditions' => 'showcompletionconditions',
        'sortorder' => 'sortorder',
        'summary' => 'summary',
        'summaryfiles' => 'summaryfiles',
        'summaryformat' => 'summaryformat'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'categoryid' => 'setCategoryid',
        'categoryname' => 'setCategoryname',
        'contacts' => 'setContacts',
        'courseimage' => 'setCourseimage',
        'customfields' => 'setCustomfields',
        'displayname' => 'setDisplayname',
        'enrollmentmethods' => 'setEnrollmentmethods',
        'fullname' => 'setFullname',
        'id' => 'setId',
        'overviewfiles' => 'setOverviewfiles',
        'shortname' => 'setShortname',
        'showactivitydates' => 'setShowactivitydates',
        'showcompletionconditions' => 'setShowcompletionconditions',
        'sortorder' => 'setSortorder',
        'summary' => 'setSummary',
        'summaryfiles' => 'setSummaryfiles',
        'summaryformat' => 'setSummaryformat'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'categoryid' => 'getCategoryid',
        'categoryname' => 'getCategoryname',
        'contacts' => 'getContacts',
        'courseimage' => 'getCourseimage',
        'customfields' => 'getCustomfields',
        'displayname' => 'getDisplayname',
        'enrollmentmethods' => 'getEnrollmentmethods',
        'fullname' => 'getFullname',
        'id' => 'getId',
        'overviewfiles' => 'getOverviewfiles',
        'shortname' => 'getShortname',
        'showactivitydates' => 'getShowactivitydates',
        'showcompletionconditions' => 'getShowcompletionconditions',
        'sortorder' => 'getSortorder',
        'summary' => 'getSummary',
        'summaryfiles' => 'getSummaryfiles',
        'summaryformat' => 'getSummaryformat'
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
        $this->setIfExists('categoryid', $data ?? [], null);
        $this->setIfExists('categoryname', $data ?? [], null);
        $this->setIfExists('contacts', $data ?? [], null);
        $this->setIfExists('courseimage', $data ?? [], null);
        $this->setIfExists('customfields', $data ?? [], null);
        $this->setIfExists('displayname', $data ?? [], null);
        $this->setIfExists('enrollmentmethods', $data ?? [], null);
        $this->setIfExists('fullname', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('overviewfiles', $data ?? [], null);
        $this->setIfExists('shortname', $data ?? [], null);
        $this->setIfExists('showactivitydates', $data ?? [], null);
        $this->setIfExists('showcompletionconditions', $data ?? [], null);
        $this->setIfExists('sortorder', $data ?? [], null);
        $this->setIfExists('summary', $data ?? [], null);
        $this->setIfExists('summaryfiles', $data ?? [], null);
        $this->setIfExists('summaryformat', $data ?? [], null);
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
     * Gets categoryid
     *
     * @return int|null
     */
    public function getCategoryid()
    {
        return $this->container['categoryid'];
    }

    /**
     * Sets categoryid
     *
     * @param int|null $categoryid category id
     *
     * @return self
     */
    public function setCategoryid($categoryid)
    {
        if (is_null($categoryid)) {
            throw new \InvalidArgumentException('non-nullable categoryid cannot be null');
        }
        $this->container['categoryid'] = $categoryid;

        return $this;
    }

    /**
     * Gets categoryname
     *
     * @return string|null
     */
    public function getCategoryname()
    {
        return $this->container['categoryname'];
    }

    /**
     * Sets categoryname
     *
     * @param string|null $categoryname category name
     *
     * @return self
     */
    public function setCategoryname($categoryname)
    {
        if (is_null($categoryname)) {
            throw new \InvalidArgumentException('non-nullable categoryname cannot be null');
        }
        $this->container['categoryname'] = $categoryname;

        return $this;
    }

    /**
     * Gets contacts
     *
     * @return \OpenAPI\Client\Model\CoreCourseSearchCourses200ResponseCoursesInnerContactsInner[]|null
     */
    public function getContacts()
    {
        return $this->container['contacts'];
    }

    /**
     * Sets contacts
     *
     * @param \OpenAPI\Client\Model\CoreCourseSearchCourses200ResponseCoursesInnerContactsInner[]|null $contacts contacts
     *
     * @return self
     */
    public function setContacts($contacts)
    {
        if (is_null($contacts)) {
            throw new \InvalidArgumentException('non-nullable contacts cannot be null');
        }
        $this->container['contacts'] = $contacts;

        return $this;
    }

    /**
     * Gets courseimage
     *
     * @return string|null
     */
    public function getCourseimage()
    {
        return $this->container['courseimage'];
    }

    /**
     * Sets courseimage
     *
     * @param string|null $courseimage Course image
     *
     * @return self
     */
    public function setCourseimage($courseimage)
    {
        if (is_null($courseimage)) {
            throw new \InvalidArgumentException('non-nullable courseimage cannot be null');
        }
        $this->container['courseimage'] = $courseimage;

        return $this;
    }

    /**
     * Gets customfields
     *
     * @return \OpenAPI\Client\Model\CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner[]|null
     */
    public function getCustomfields()
    {
        return $this->container['customfields'];
    }

    /**
     * Sets customfields
     *
     * @param \OpenAPI\Client\Model\CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner[]|null $customfields customfields
     *
     * @return self
     */
    public function setCustomfields($customfields)
    {
        if (is_null($customfields)) {
            throw new \InvalidArgumentException('non-nullable customfields cannot be null');
        }
        $this->container['customfields'] = $customfields;

        return $this;
    }

    /**
     * Gets displayname
     *
     * @return string|null
     */
    public function getDisplayname()
    {
        return $this->container['displayname'];
    }

    /**
     * Sets displayname
     *
     * @param string|null $displayname course display name
     *
     * @return self
     */
    public function setDisplayname($displayname)
    {
        if (is_null($displayname)) {
            throw new \InvalidArgumentException('non-nullable displayname cannot be null');
        }
        $this->container['displayname'] = $displayname;

        return $this;
    }

    /**
     * Gets enrollmentmethods
     *
     * @return object[]|null
     */
    public function getEnrollmentmethods()
    {
        return $this->container['enrollmentmethods'];
    }

    /**
     * Sets enrollmentmethods
     *
     * @param object[]|null $enrollmentmethods enrollmentmethods
     *
     * @return self
     */
    public function setEnrollmentmethods($enrollmentmethods)
    {
        if (is_null($enrollmentmethods)) {
            throw new \InvalidArgumentException('non-nullable enrollmentmethods cannot be null');
        }
        $this->container['enrollmentmethods'] = $enrollmentmethods;

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
     * @param string|null $fullname course full name
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
     * @param int|null $id course id
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
     * Gets overviewfiles
     *
     * @return \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null
     */
    public function getOverviewfiles()
    {
        return $this->container['overviewfiles'];
    }

    /**
     * Sets overviewfiles
     *
     * @param \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null $overviewfiles overviewfiles
     *
     * @return self
     */
    public function setOverviewfiles($overviewfiles)
    {
        if (is_null($overviewfiles)) {
            throw new \InvalidArgumentException('non-nullable overviewfiles cannot be null');
        }
        $this->container['overviewfiles'] = $overviewfiles;

        return $this;
    }

    /**
     * Gets shortname
     *
     * @return string|null
     */
    public function getShortname()
    {
        return $this->container['shortname'];
    }

    /**
     * Sets shortname
     *
     * @param string|null $shortname course short name
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
     * Gets showactivitydates
     *
     * @return bool|null
     */
    public function getShowactivitydates()
    {
        return $this->container['showactivitydates'];
    }

    /**
     * Sets showactivitydates
     *
     * @param bool|null $showactivitydates Whether the activity dates are shown or not
     *
     * @return self
     */
    public function setShowactivitydates($showactivitydates)
    {
        if (is_null($showactivitydates)) {
            throw new \InvalidArgumentException('non-nullable showactivitydates cannot be null');
        }
        $this->container['showactivitydates'] = $showactivitydates;

        return $this;
    }

    /**
     * Gets showcompletionconditions
     *
     * @return bool|null
     */
    public function getShowcompletionconditions()
    {
        return $this->container['showcompletionconditions'];
    }

    /**
     * Sets showcompletionconditions
     *
     * @param bool|null $showcompletionconditions Whether the activity completion conditions are shown or not
     *
     * @return self
     */
    public function setShowcompletionconditions($showcompletionconditions)
    {
        if (is_null($showcompletionconditions)) {
            throw new \InvalidArgumentException('non-nullable showcompletionconditions cannot be null');
        }
        $this->container['showcompletionconditions'] = $showcompletionconditions;

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
     * @param int|null $sortorder Sort order in the category
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
     * Gets summary
     *
     * @return string|null
     */
    public function getSummary()
    {
        return $this->container['summary'];
    }

    /**
     * Sets summary
     *
     * @param string|null $summary summary
     *
     * @return self
     */
    public function setSummary($summary)
    {
        if (is_null($summary)) {
            throw new \InvalidArgumentException('non-nullable summary cannot be null');
        }
        $this->container['summary'] = $summary;

        return $this;
    }

    /**
     * Gets summaryfiles
     *
     * @return \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null
     */
    public function getSummaryfiles()
    {
        return $this->container['summaryfiles'];
    }

    /**
     * Sets summaryfiles
     *
     * @param \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null $summaryfiles summaryfiles
     *
     * @return self
     */
    public function setSummaryfiles($summaryfiles)
    {
        if (is_null($summaryfiles)) {
            throw new \InvalidArgumentException('non-nullable summaryfiles cannot be null');
        }
        $this->container['summaryfiles'] = $summaryfiles;

        return $this;
    }

    /**
     * Gets summaryformat
     *
     * @return int|null
     */
    public function getSummaryformat()
    {
        return $this->container['summaryformat'];
    }

    /**
     * Sets summaryformat
     *
     * @param int|null $summaryformat summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setSummaryformat($summaryformat)
    {
        if (is_null($summaryformat)) {
            throw new \InvalidArgumentException('non-nullable summaryformat cannot be null');
        }
        $this->container['summaryformat'] = $summaryformat;

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


