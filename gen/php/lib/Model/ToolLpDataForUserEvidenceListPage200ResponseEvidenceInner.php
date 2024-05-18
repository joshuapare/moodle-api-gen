<?php
/**
 * ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner
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
 * ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'tool_lp_data_for_user_evidence_list_page_200_response_evidence_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'canmanage' => 'bool',
        'competencycount' => 'int',
        'description' => 'string',
        'descriptionformat' => 'int',
        'filecount' => 'int',
        'files' => '\OpenAPI\Client\Model\ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner[]',
        'hasurlorfiles' => 'bool',
        'id' => 'int',
        'name' => 'string',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'url' => 'string',
        'urlshort' => 'string',
        'usercompetencies' => '\OpenAPI\Client\Model\ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner[]',
        'userhasplan' => 'bool',
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
        'canmanage' => null,
        'competencycount' => null,
        'description' => null,
        'descriptionformat' => null,
        'filecount' => null,
        'files' => null,
        'hasurlorfiles' => null,
        'id' => null,
        'name' => null,
        'timecreated' => null,
        'timemodified' => null,
        'url' => null,
        'urlshort' => null,
        'usercompetencies' => null,
        'userhasplan' => null,
        'userid' => null,
        'usermodified' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'canmanage' => false,
        'competencycount' => false,
        'description' => false,
        'descriptionformat' => false,
        'filecount' => false,
        'files' => false,
        'hasurlorfiles' => false,
        'id' => false,
        'name' => false,
        'timecreated' => false,
        'timemodified' => false,
        'url' => false,
        'urlshort' => false,
        'usercompetencies' => false,
        'userhasplan' => false,
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
        'canmanage' => 'canmanage',
        'competencycount' => 'competencycount',
        'description' => 'description',
        'descriptionformat' => 'descriptionformat',
        'filecount' => 'filecount',
        'files' => 'files',
        'hasurlorfiles' => 'hasurlorfiles',
        'id' => 'id',
        'name' => 'name',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'url' => 'url',
        'urlshort' => 'urlshort',
        'usercompetencies' => 'usercompetencies',
        'userhasplan' => 'userhasplan',
        'userid' => 'userid',
        'usermodified' => 'usermodified'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'canmanage' => 'setCanmanage',
        'competencycount' => 'setCompetencycount',
        'description' => 'setDescription',
        'descriptionformat' => 'setDescriptionformat',
        'filecount' => 'setFilecount',
        'files' => 'setFiles',
        'hasurlorfiles' => 'setHasurlorfiles',
        'id' => 'setId',
        'name' => 'setName',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'url' => 'setUrl',
        'urlshort' => 'setUrlshort',
        'usercompetencies' => 'setUsercompetencies',
        'userhasplan' => 'setUserhasplan',
        'userid' => 'setUserid',
        'usermodified' => 'setUsermodified'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'canmanage' => 'getCanmanage',
        'competencycount' => 'getCompetencycount',
        'description' => 'getDescription',
        'descriptionformat' => 'getDescriptionformat',
        'filecount' => 'getFilecount',
        'files' => 'getFiles',
        'hasurlorfiles' => 'getHasurlorfiles',
        'id' => 'getId',
        'name' => 'getName',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'url' => 'getUrl',
        'urlshort' => 'getUrlshort',
        'usercompetencies' => 'getUsercompetencies',
        'userhasplan' => 'getUserhasplan',
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
        $this->setIfExists('canmanage', $data ?? [], null);
        $this->setIfExists('competencycount', $data ?? [], null);
        $this->setIfExists('description', $data ?? [], '');
        $this->setIfExists('descriptionformat', $data ?? [], 1);
        $this->setIfExists('filecount', $data ?? [], null);
        $this->setIfExists('files', $data ?? [], null);
        $this->setIfExists('hasurlorfiles', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], 0);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], 0);
        $this->setIfExists('timemodified', $data ?? [], 0);
        $this->setIfExists('url', $data ?? [], '');
        $this->setIfExists('urlshort', $data ?? [], null);
        $this->setIfExists('usercompetencies', $data ?? [], null);
        $this->setIfExists('userhasplan', $data ?? [], null);
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
     * Gets canmanage
     *
     * @return bool|null
     */
    public function getCanmanage()
    {
        return $this->container['canmanage'];
    }

    /**
     * Sets canmanage
     *
     * @param bool|null $canmanage canmanage
     *
     * @return self
     */
    public function setCanmanage($canmanage)
    {
        if (is_null($canmanage)) {
            throw new \InvalidArgumentException('non-nullable canmanage cannot be null');
        }
        $this->container['canmanage'] = $canmanage;

        return $this;
    }

    /**
     * Gets competencycount
     *
     * @return int|null
     */
    public function getCompetencycount()
    {
        return $this->container['competencycount'];
    }

    /**
     * Sets competencycount
     *
     * @param int|null $competencycount competencycount
     *
     * @return self
     */
    public function setCompetencycount($competencycount)
    {
        if (is_null($competencycount)) {
            throw new \InvalidArgumentException('non-nullable competencycount cannot be null');
        }
        $this->container['competencycount'] = $competencycount;

        return $this;
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
     * Gets filecount
     *
     * @return int|null
     */
    public function getFilecount()
    {
        return $this->container['filecount'];
    }

    /**
     * Sets filecount
     *
     * @param int|null $filecount filecount
     *
     * @return self
     */
    public function setFilecount($filecount)
    {
        if (is_null($filecount)) {
            throw new \InvalidArgumentException('non-nullable filecount cannot be null');
        }
        $this->container['filecount'] = $filecount;

        return $this;
    }

    /**
     * Gets files
     *
     * @return \OpenAPI\Client\Model\ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner[]|null
     */
    public function getFiles()
    {
        return $this->container['files'];
    }

    /**
     * Sets files
     *
     * @param \OpenAPI\Client\Model\ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner[]|null $files files
     *
     * @return self
     */
    public function setFiles($files)
    {
        if (is_null($files)) {
            throw new \InvalidArgumentException('non-nullable files cannot be null');
        }
        $this->container['files'] = $files;

        return $this;
    }

    /**
     * Gets hasurlorfiles
     *
     * @return bool|null
     */
    public function getHasurlorfiles()
    {
        return $this->container['hasurlorfiles'];
    }

    /**
     * Sets hasurlorfiles
     *
     * @param bool|null $hasurlorfiles hasurlorfiles
     *
     * @return self
     */
    public function setHasurlorfiles($hasurlorfiles)
    {
        if (is_null($hasurlorfiles)) {
            throw new \InvalidArgumentException('non-nullable hasurlorfiles cannot be null');
        }
        $this->container['hasurlorfiles'] = $hasurlorfiles;

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
     * @param int|null $id id
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
     * @param string|null $name name
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
     * Gets urlshort
     *
     * @return string|null
     */
    public function getUrlshort()
    {
        return $this->container['urlshort'];
    }

    /**
     * Sets urlshort
     *
     * @param string|null $urlshort urlshort
     *
     * @return self
     */
    public function setUrlshort($urlshort)
    {
        if (is_null($urlshort)) {
            throw new \InvalidArgumentException('non-nullable urlshort cannot be null');
        }
        $this->container['urlshort'] = $urlshort;

        return $this;
    }

    /**
     * Gets usercompetencies
     *
     * @return \OpenAPI\Client\Model\ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner[]|null
     */
    public function getUsercompetencies()
    {
        return $this->container['usercompetencies'];
    }

    /**
     * Sets usercompetencies
     *
     * @param \OpenAPI\Client\Model\ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner[]|null $usercompetencies usercompetencies
     *
     * @return self
     */
    public function setUsercompetencies($usercompetencies)
    {
        if (is_null($usercompetencies)) {
            throw new \InvalidArgumentException('non-nullable usercompetencies cannot be null');
        }
        $this->container['usercompetencies'] = $usercompetencies;

        return $this;
    }

    /**
     * Gets userhasplan
     *
     * @return bool|null
     */
    public function getUserhasplan()
    {
        return $this->container['userhasplan'];
    }

    /**
     * Sets userhasplan
     *
     * @param bool|null $userhasplan userhasplan
     *
     * @return self
     */
    public function setUserhasplan($userhasplan)
    {
        if (is_null($userhasplan)) {
            throw new \InvalidArgumentException('non-nullable userhasplan cannot be null');
        }
        $this->container['userhasplan'] = $userhasplan;

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
     * @param int|null $userid userid
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

