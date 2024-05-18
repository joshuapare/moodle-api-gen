<?php
/**
 * ModWorkshopGetSubmissions200ResponseSubmissionsInner
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
 * ModWorkshopGetSubmissions200ResponseSubmissionsInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModWorkshopGetSubmissions200ResponseSubmissionsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_workshop_get_submissions_200_response_submissions_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'attachment' => 'int',
        'attachmentfiles' => '\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]',
        'authorid' => 'int',
        'content' => 'string',
        'contentfiles' => '\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]',
        'contentformat' => 'int',
        'contenttrust' => 'int',
        'example' => 'bool',
        'feedbackauthor' => 'string',
        'feedbackauthorformat' => 'int',
        'grade' => 'float',
        'gradeover' => 'float',
        'gradeoverby' => 'int',
        'id' => 'int',
        'late' => 'int',
        'published' => 'bool',
        'timecreated' => 'int',
        'timegraded' => 'int',
        'timemodified' => 'int',
        'title' => 'string',
        'workshopid' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'attachment' => null,
        'attachmentfiles' => null,
        'authorid' => null,
        'content' => null,
        'contentfiles' => null,
        'contentformat' => null,
        'contenttrust' => null,
        'example' => null,
        'feedbackauthor' => null,
        'feedbackauthorformat' => null,
        'grade' => null,
        'gradeover' => null,
        'gradeoverby' => null,
        'id' => null,
        'late' => null,
        'published' => null,
        'timecreated' => null,
        'timegraded' => null,
        'timemodified' => null,
        'title' => null,
        'workshopid' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'attachment' => false,
        'attachmentfiles' => false,
        'authorid' => false,
        'content' => false,
        'contentfiles' => false,
        'contentformat' => false,
        'contenttrust' => false,
        'example' => false,
        'feedbackauthor' => false,
        'feedbackauthorformat' => false,
        'grade' => false,
        'gradeover' => false,
        'gradeoverby' => false,
        'id' => false,
        'late' => false,
        'published' => false,
        'timecreated' => false,
        'timegraded' => false,
        'timemodified' => false,
        'title' => false,
        'workshopid' => false
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
        'attachment' => 'attachment',
        'attachmentfiles' => 'attachmentfiles',
        'authorid' => 'authorid',
        'content' => 'content',
        'contentfiles' => 'contentfiles',
        'contentformat' => 'contentformat',
        'contenttrust' => 'contenttrust',
        'example' => 'example',
        'feedbackauthor' => 'feedbackauthor',
        'feedbackauthorformat' => 'feedbackauthorformat',
        'grade' => 'grade',
        'gradeover' => 'gradeover',
        'gradeoverby' => 'gradeoverby',
        'id' => 'id',
        'late' => 'late',
        'published' => 'published',
        'timecreated' => 'timecreated',
        'timegraded' => 'timegraded',
        'timemodified' => 'timemodified',
        'title' => 'title',
        'workshopid' => 'workshopid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'attachment' => 'setAttachment',
        'attachmentfiles' => 'setAttachmentfiles',
        'authorid' => 'setAuthorid',
        'content' => 'setContent',
        'contentfiles' => 'setContentfiles',
        'contentformat' => 'setContentformat',
        'contenttrust' => 'setContenttrust',
        'example' => 'setExample',
        'feedbackauthor' => 'setFeedbackauthor',
        'feedbackauthorformat' => 'setFeedbackauthorformat',
        'grade' => 'setGrade',
        'gradeover' => 'setGradeover',
        'gradeoverby' => 'setGradeoverby',
        'id' => 'setId',
        'late' => 'setLate',
        'published' => 'setPublished',
        'timecreated' => 'setTimecreated',
        'timegraded' => 'setTimegraded',
        'timemodified' => 'setTimemodified',
        'title' => 'setTitle',
        'workshopid' => 'setWorkshopid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'attachment' => 'getAttachment',
        'attachmentfiles' => 'getAttachmentfiles',
        'authorid' => 'getAuthorid',
        'content' => 'getContent',
        'contentfiles' => 'getContentfiles',
        'contentformat' => 'getContentformat',
        'contenttrust' => 'getContenttrust',
        'example' => 'getExample',
        'feedbackauthor' => 'getFeedbackauthor',
        'feedbackauthorformat' => 'getFeedbackauthorformat',
        'grade' => 'getGrade',
        'gradeover' => 'getGradeover',
        'gradeoverby' => 'getGradeoverby',
        'id' => 'getId',
        'late' => 'getLate',
        'published' => 'getPublished',
        'timecreated' => 'getTimecreated',
        'timegraded' => 'getTimegraded',
        'timemodified' => 'getTimemodified',
        'title' => 'getTitle',
        'workshopid' => 'getWorkshopid'
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
        $this->setIfExists('attachment', $data ?? [], 0);
        $this->setIfExists('attachmentfiles', $data ?? [], null);
        $this->setIfExists('authorid', $data ?? [], null);
        $this->setIfExists('content', $data ?? [], null);
        $this->setIfExists('contentfiles', $data ?? [], null);
        $this->setIfExists('contentformat', $data ?? [], 0);
        $this->setIfExists('contenttrust', $data ?? [], 0);
        $this->setIfExists('example', $data ?? [], false);
        $this->setIfExists('feedbackauthor', $data ?? [], null);
        $this->setIfExists('feedbackauthorformat', $data ?? [], 0);
        $this->setIfExists('grade', $data ?? [], null);
        $this->setIfExists('gradeover', $data ?? [], null);
        $this->setIfExists('gradeoverby', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('late', $data ?? [], 0);
        $this->setIfExists('published', $data ?? [], false);
        $this->setIfExists('timecreated', $data ?? [], null);
        $this->setIfExists('timegraded', $data ?? [], null);
        $this->setIfExists('timemodified', $data ?? [], null);
        $this->setIfExists('title', $data ?? [], null);
        $this->setIfExists('workshopid', $data ?? [], null);
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
     * Gets attachment
     *
     * @return int|null
     */
    public function getAttachment()
    {
        return $this->container['attachment'];
    }

    /**
     * Sets attachment
     *
     * @param int|null $attachment Used by File API file_postupdate_standard_filemanager.
     *
     * @return self
     */
    public function setAttachment($attachment)
    {
        if (is_null($attachment)) {
            throw new \InvalidArgumentException('non-nullable attachment cannot be null');
        }
        $this->container['attachment'] = $attachment;

        return $this;
    }

    /**
     * Gets attachmentfiles
     *
     * @return \OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]|null
     */
    public function getAttachmentfiles()
    {
        return $this->container['attachmentfiles'];
    }

    /**
     * Sets attachmentfiles
     *
     * @param \OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]|null $attachmentfiles attachmentfiles
     *
     * @return self
     */
    public function setAttachmentfiles($attachmentfiles)
    {
        if (is_null($attachmentfiles)) {
            throw new \InvalidArgumentException('non-nullable attachmentfiles cannot be null');
        }
        $this->container['attachmentfiles'] = $attachmentfiles;

        return $this;
    }

    /**
     * Gets authorid
     *
     * @return int|null
     */
    public function getAuthorid()
    {
        return $this->container['authorid'];
    }

    /**
     * Sets authorid
     *
     * @param int|null $authorid The author of the submission.
     *
     * @return self
     */
    public function setAuthorid($authorid)
    {
        if (is_null($authorid)) {
            throw new \InvalidArgumentException('non-nullable authorid cannot be null');
        }
        $this->container['authorid'] = $authorid;

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
     * @param string|null $content Submission text.
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
     * Gets contentfiles
     *
     * @return \OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]|null
     */
    public function getContentfiles()
    {
        return $this->container['contentfiles'];
    }

    /**
     * Sets contentfiles
     *
     * @param \OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]|null $contentfiles contentfiles
     *
     * @return self
     */
    public function setContentfiles($contentfiles)
    {
        if (is_null($contentfiles)) {
            throw new \InvalidArgumentException('non-nullable contentfiles cannot be null');
        }
        $this->container['contentfiles'] = $contentfiles;

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
     * @param int|null $contentformat content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
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
     * Gets contenttrust
     *
     * @return int|null
     */
    public function getContenttrust()
    {
        return $this->container['contenttrust'];
    }

    /**
     * Sets contenttrust
     *
     * @param int|null $contenttrust The trust mode of the data.
     *
     * @return self
     */
    public function setContenttrust($contenttrust)
    {
        if (is_null($contenttrust)) {
            throw new \InvalidArgumentException('non-nullable contenttrust cannot be null');
        }
        $this->container['contenttrust'] = $contenttrust;

        return $this;
    }

    /**
     * Gets example
     *
     * @return bool|null
     */
    public function getExample()
    {
        return $this->container['example'];
    }

    /**
     * Sets example
     *
     * @param bool|null $example Is this submission an example from teacher.
     *
     * @return self
     */
    public function setExample($example)
    {
        if (is_null($example)) {
            throw new \InvalidArgumentException('non-nullable example cannot be null');
        }
        $this->container['example'] = $example;

        return $this;
    }

    /**
     * Gets feedbackauthor
     *
     * @return string|null
     */
    public function getFeedbackauthor()
    {
        return $this->container['feedbackauthor'];
    }

    /**
     * Sets feedbackauthor
     *
     * @param string|null $feedbackauthor Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding.
     *
     * @return self
     */
    public function setFeedbackauthor($feedbackauthor)
    {
        if (is_null($feedbackauthor)) {
            throw new \InvalidArgumentException('non-nullable feedbackauthor cannot be null');
        }
        $this->container['feedbackauthor'] = $feedbackauthor;

        return $this;
    }

    /**
     * Gets feedbackauthorformat
     *
     * @return int|null
     */
    public function getFeedbackauthorformat()
    {
        return $this->container['feedbackauthorformat'];
    }

    /**
     * Sets feedbackauthorformat
     *
     * @param int|null $feedbackauthorformat feedbackauthor format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setFeedbackauthorformat($feedbackauthorformat)
    {
        if (is_null($feedbackauthorformat)) {
            throw new \InvalidArgumentException('non-nullable feedbackauthorformat cannot be null');
        }
        $this->container['feedbackauthorformat'] = $feedbackauthorformat;

        return $this;
    }

    /**
     * Gets grade
     *
     * @return float|null
     */
    public function getGrade()
    {
        return $this->container['grade'];
    }

    /**
     * Sets grade
     *
     * @param float|null $grade Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet.
     *
     * @return self
     */
    public function setGrade($grade)
    {
        if (is_null($grade)) {
            throw new \InvalidArgumentException('non-nullable grade cannot be null');
        }
        $this->container['grade'] = $grade;

        return $this;
    }

    /**
     * Gets gradeover
     *
     * @return float|null
     */
    public function getGradeover()
    {
        return $this->container['gradeover'];
    }

    /**
     * Sets gradeover
     *
     * @param float|null $gradeover Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden.
     *
     * @return self
     */
    public function setGradeover($gradeover)
    {
        if (is_null($gradeover)) {
            throw new \InvalidArgumentException('non-nullable gradeover cannot be null');
        }
        $this->container['gradeover'] = $gradeover;

        return $this;
    }

    /**
     * Gets gradeoverby
     *
     * @return int|null
     */
    public function getGradeoverby()
    {
        return $this->container['gradeoverby'];
    }

    /**
     * Sets gradeoverby
     *
     * @param int|null $gradeoverby The id of the user who has overridden the grade for submission.
     *
     * @return self
     */
    public function setGradeoverby($gradeoverby)
    {
        if (is_null($gradeoverby)) {
            throw new \InvalidArgumentException('non-nullable gradeoverby cannot be null');
        }
        $this->container['gradeoverby'] = $gradeoverby;

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
     * @param int|null $id The primary key of the record.
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
     * Gets late
     *
     * @return int|null
     */
    public function getLate()
    {
        return $this->container['late'];
    }

    /**
     * Sets late
     *
     * @param int|null $late Has this submission been submitted after the deadline or during the assessment phase?
     *
     * @return self
     */
    public function setLate($late)
    {
        if (is_null($late)) {
            throw new \InvalidArgumentException('non-nullable late cannot be null');
        }
        $this->container['late'] = $late;

        return $this;
    }

    /**
     * Gets published
     *
     * @return bool|null
     */
    public function getPublished()
    {
        return $this->container['published'];
    }

    /**
     * Sets published
     *
     * @param bool|null $published Shall the submission be available to other when the workshop is closed.
     *
     * @return self
     */
    public function setPublished($published)
    {
        if (is_null($published)) {
            throw new \InvalidArgumentException('non-nullable published cannot be null');
        }
        $this->container['published'] = $published;

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
     * @param int|null $timecreated Timestamp when the work was submitted for the first time.
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
     * Gets timegraded
     *
     * @return int|null
     */
    public function getTimegraded()
    {
        return $this->container['timegraded'];
    }

    /**
     * Sets timegraded
     *
     * @param int|null $timegraded The timestamp when grade or gradeover was recently modified.
     *
     * @return self
     */
    public function setTimegraded($timegraded)
    {
        if (is_null($timegraded)) {
            throw new \InvalidArgumentException('non-nullable timegraded cannot be null');
        }
        $this->container['timegraded'] = $timegraded;

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
     * @param int|null $timemodified Timestamp when the submission has been updated.
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
     * @param string|null $title The submission title.
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
     * Gets workshopid
     *
     * @return int|null
     */
    public function getWorkshopid()
    {
        return $this->container['workshopid'];
    }

    /**
     * Sets workshopid
     *
     * @param int|null $workshopid The id of the workshop instance.
     *
     * @return self
     */
    public function setWorkshopid($workshopid)
    {
        if (is_null($workshopid)) {
            throw new \InvalidArgumentException('non-nullable workshopid cannot be null');
        }
        $this->container['workshopid'] = $workshopid;

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

