<?php
/**
 * ModForumGetDiscussionPosts200ResponsePostsInner
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
 * ModForumGetDiscussionPosts200ResponsePostsInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModForumGetDiscussionPosts200ResponsePostsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_forum_get_discussion_posts_200_response_posts_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'attachments' => '\OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostAttachmentsInner[]',
        'author' => '\OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostAuthor',
        'capabilities' => '\OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostCapabilities',
        'charcount' => 'int',
        'discussionid' => 'int',
        'hasparent' => 'bool',
        'haswordcount' => 'bool',
        'html' => '\OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostHtml',
        'id' => 'int',
        'isdeleted' => 'bool',
        'isprivatereply' => 'bool',
        'message' => 'string',
        'messageformat' => 'int',
        'messageinlinefiles' => '\OpenAPI\Client\Model\ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner[]',
        'parentid' => 'int',
        'replysubject' => 'string',
        'subject' => 'string',
        'tags' => '\OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostTagsInner[]',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'unread' => 'bool',
        'urls' => '\OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostUrls',
        'wordcount' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'attachments' => null,
        'author' => null,
        'capabilities' => null,
        'charcount' => null,
        'discussionid' => null,
        'hasparent' => null,
        'haswordcount' => null,
        'html' => null,
        'id' => null,
        'isdeleted' => null,
        'isprivatereply' => null,
        'message' => null,
        'messageformat' => null,
        'messageinlinefiles' => null,
        'parentid' => null,
        'replysubject' => null,
        'subject' => null,
        'tags' => null,
        'timecreated' => null,
        'timemodified' => null,
        'unread' => null,
        'urls' => null,
        'wordcount' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'attachments' => false,
        'author' => false,
        'capabilities' => false,
        'charcount' => false,
        'discussionid' => false,
        'hasparent' => false,
        'haswordcount' => false,
        'html' => false,
        'id' => false,
        'isdeleted' => false,
        'isprivatereply' => false,
        'message' => false,
        'messageformat' => false,
        'messageinlinefiles' => false,
        'parentid' => false,
        'replysubject' => false,
        'subject' => false,
        'tags' => false,
        'timecreated' => false,
        'timemodified' => false,
        'unread' => false,
        'urls' => false,
        'wordcount' => false
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
        'attachments' => 'attachments',
        'author' => 'author',
        'capabilities' => 'capabilities',
        'charcount' => 'charcount',
        'discussionid' => 'discussionid',
        'hasparent' => 'hasparent',
        'haswordcount' => 'haswordcount',
        'html' => 'html',
        'id' => 'id',
        'isdeleted' => 'isdeleted',
        'isprivatereply' => 'isprivatereply',
        'message' => 'message',
        'messageformat' => 'messageformat',
        'messageinlinefiles' => 'messageinlinefiles',
        'parentid' => 'parentid',
        'replysubject' => 'replysubject',
        'subject' => 'subject',
        'tags' => 'tags',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'unread' => 'unread',
        'urls' => 'urls',
        'wordcount' => 'wordcount'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'attachments' => 'setAttachments',
        'author' => 'setAuthor',
        'capabilities' => 'setCapabilities',
        'charcount' => 'setCharcount',
        'discussionid' => 'setDiscussionid',
        'hasparent' => 'setHasparent',
        'haswordcount' => 'setHaswordcount',
        'html' => 'setHtml',
        'id' => 'setId',
        'isdeleted' => 'setIsdeleted',
        'isprivatereply' => 'setIsprivatereply',
        'message' => 'setMessage',
        'messageformat' => 'setMessageformat',
        'messageinlinefiles' => 'setMessageinlinefiles',
        'parentid' => 'setParentid',
        'replysubject' => 'setReplysubject',
        'subject' => 'setSubject',
        'tags' => 'setTags',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'unread' => 'setUnread',
        'urls' => 'setUrls',
        'wordcount' => 'setWordcount'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'attachments' => 'getAttachments',
        'author' => 'getAuthor',
        'capabilities' => 'getCapabilities',
        'charcount' => 'getCharcount',
        'discussionid' => 'getDiscussionid',
        'hasparent' => 'getHasparent',
        'haswordcount' => 'getHaswordcount',
        'html' => 'getHtml',
        'id' => 'getId',
        'isdeleted' => 'getIsdeleted',
        'isprivatereply' => 'getIsprivatereply',
        'message' => 'getMessage',
        'messageformat' => 'getMessageformat',
        'messageinlinefiles' => 'getMessageinlinefiles',
        'parentid' => 'getParentid',
        'replysubject' => 'getReplysubject',
        'subject' => 'getSubject',
        'tags' => 'getTags',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'unread' => 'getUnread',
        'urls' => 'getUrls',
        'wordcount' => 'getWordcount'
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
        $this->setIfExists('attachments', $data ?? [], null);
        $this->setIfExists('author', $data ?? [], null);
        $this->setIfExists('capabilities', $data ?? [], null);
        $this->setIfExists('charcount', $data ?? [], null);
        $this->setIfExists('discussionid', $data ?? [], null);
        $this->setIfExists('hasparent', $data ?? [], null);
        $this->setIfExists('haswordcount', $data ?? [], null);
        $this->setIfExists('html', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('isdeleted', $data ?? [], null);
        $this->setIfExists('isprivatereply', $data ?? [], null);
        $this->setIfExists('message', $data ?? [], null);
        $this->setIfExists('messageformat', $data ?? [], null);
        $this->setIfExists('messageinlinefiles', $data ?? [], null);
        $this->setIfExists('parentid', $data ?? [], null);
        $this->setIfExists('replysubject', $data ?? [], null);
        $this->setIfExists('subject', $data ?? [], null);
        $this->setIfExists('tags', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], null);
        $this->setIfExists('timemodified', $data ?? [], null);
        $this->setIfExists('unread', $data ?? [], null);
        $this->setIfExists('urls', $data ?? [], null);
        $this->setIfExists('wordcount', $data ?? [], null);
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
     * Gets attachments
     *
     * @return \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostAttachmentsInner[]|null
     */
    public function getAttachments()
    {
        return $this->container['attachments'];
    }

    /**
     * Sets attachments
     *
     * @param \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostAttachmentsInner[]|null $attachments attachments
     *
     * @return self
     */
    public function setAttachments($attachments)
    {
        if (is_null($attachments)) {
            throw new \InvalidArgumentException('non-nullable attachments cannot be null');
        }
        $this->container['attachments'] = $attachments;

        return $this;
    }

    /**
     * Gets author
     *
     * @return \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostAuthor|null
     */
    public function getAuthor()
    {
        return $this->container['author'];
    }

    /**
     * Sets author
     *
     * @param \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostAuthor|null $author author
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
     * Gets capabilities
     *
     * @return \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostCapabilities|null
     */
    public function getCapabilities()
    {
        return $this->container['capabilities'];
    }

    /**
     * Sets capabilities
     *
     * @param \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostCapabilities|null $capabilities capabilities
     *
     * @return self
     */
    public function setCapabilities($capabilities)
    {
        if (is_null($capabilities)) {
            throw new \InvalidArgumentException('non-nullable capabilities cannot be null');
        }
        $this->container['capabilities'] = $capabilities;

        return $this;
    }

    /**
     * Gets charcount
     *
     * @return int|null
     */
    public function getCharcount()
    {
        return $this->container['charcount'];
    }

    /**
     * Sets charcount
     *
     * @param int|null $charcount charcount
     *
     * @return self
     */
    public function setCharcount($charcount)
    {
        if (is_null($charcount)) {
            throw new \InvalidArgumentException('non-nullable charcount cannot be null');
        }
        $this->container['charcount'] = $charcount;

        return $this;
    }

    /**
     * Gets discussionid
     *
     * @return int|null
     */
    public function getDiscussionid()
    {
        return $this->container['discussionid'];
    }

    /**
     * Sets discussionid
     *
     * @param int|null $discussionid discussionid
     *
     * @return self
     */
    public function setDiscussionid($discussionid)
    {
        if (is_null($discussionid)) {
            throw new \InvalidArgumentException('non-nullable discussionid cannot be null');
        }
        $this->container['discussionid'] = $discussionid;

        return $this;
    }

    /**
     * Gets hasparent
     *
     * @return bool|null
     */
    public function getHasparent()
    {
        return $this->container['hasparent'];
    }

    /**
     * Sets hasparent
     *
     * @param bool|null $hasparent hasparent
     *
     * @return self
     */
    public function setHasparent($hasparent)
    {
        if (is_null($hasparent)) {
            throw new \InvalidArgumentException('non-nullable hasparent cannot be null');
        }
        $this->container['hasparent'] = $hasparent;

        return $this;
    }

    /**
     * Gets haswordcount
     *
     * @return bool|null
     */
    public function getHaswordcount()
    {
        return $this->container['haswordcount'];
    }

    /**
     * Sets haswordcount
     *
     * @param bool|null $haswordcount haswordcount
     *
     * @return self
     */
    public function setHaswordcount($haswordcount)
    {
        if (is_null($haswordcount)) {
            throw new \InvalidArgumentException('non-nullable haswordcount cannot be null');
        }
        $this->container['haswordcount'] = $haswordcount;

        return $this;
    }

    /**
     * Gets html
     *
     * @return \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostHtml|null
     */
    public function getHtml()
    {
        return $this->container['html'];
    }

    /**
     * Sets html
     *
     * @param \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostHtml|null $html html
     *
     * @return self
     */
    public function setHtml($html)
    {
        if (is_null($html)) {
            throw new \InvalidArgumentException('non-nullable html cannot be null');
        }
        $this->container['html'] = $html;

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
     * Gets isdeleted
     *
     * @return bool|null
     */
    public function getIsdeleted()
    {
        return $this->container['isdeleted'];
    }

    /**
     * Sets isdeleted
     *
     * @param bool|null $isdeleted isdeleted
     *
     * @return self
     */
    public function setIsdeleted($isdeleted)
    {
        if (is_null($isdeleted)) {
            throw new \InvalidArgumentException('non-nullable isdeleted cannot be null');
        }
        $this->container['isdeleted'] = $isdeleted;

        return $this;
    }

    /**
     * Gets isprivatereply
     *
     * @return bool|null
     */
    public function getIsprivatereply()
    {
        return $this->container['isprivatereply'];
    }

    /**
     * Sets isprivatereply
     *
     * @param bool|null $isprivatereply isprivatereply
     *
     * @return self
     */
    public function setIsprivatereply($isprivatereply)
    {
        if (is_null($isprivatereply)) {
            throw new \InvalidArgumentException('non-nullable isprivatereply cannot be null');
        }
        $this->container['isprivatereply'] = $isprivatereply;

        return $this;
    }

    /**
     * Gets message
     *
     * @return string|null
     */
    public function getMessage()
    {
        return $this->container['message'];
    }

    /**
     * Sets message
     *
     * @param string|null $message message
     *
     * @return self
     */
    public function setMessage($message)
    {
        if (is_null($message)) {
            throw new \InvalidArgumentException('non-nullable message cannot be null');
        }
        $this->container['message'] = $message;

        return $this;
    }

    /**
     * Gets messageformat
     *
     * @return int|null
     */
    public function getMessageformat()
    {
        return $this->container['messageformat'];
    }

    /**
     * Sets messageformat
     *
     * @param int|null $messageformat message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setMessageformat($messageformat)
    {
        if (is_null($messageformat)) {
            throw new \InvalidArgumentException('non-nullable messageformat cannot be null');
        }
        $this->container['messageformat'] = $messageformat;

        return $this;
    }

    /**
     * Gets messageinlinefiles
     *
     * @return \OpenAPI\Client\Model\ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner[]|null
     */
    public function getMessageinlinefiles()
    {
        return $this->container['messageinlinefiles'];
    }

    /**
     * Sets messageinlinefiles
     *
     * @param \OpenAPI\Client\Model\ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner[]|null $messageinlinefiles messageinlinefiles
     *
     * @return self
     */
    public function setMessageinlinefiles($messageinlinefiles)
    {
        if (is_null($messageinlinefiles)) {
            throw new \InvalidArgumentException('non-nullable messageinlinefiles cannot be null');
        }
        $this->container['messageinlinefiles'] = $messageinlinefiles;

        return $this;
    }

    /**
     * Gets parentid
     *
     * @return int|null
     */
    public function getParentid()
    {
        return $this->container['parentid'];
    }

    /**
     * Sets parentid
     *
     * @param int|null $parentid parentid
     *
     * @return self
     */
    public function setParentid($parentid)
    {
        if (is_null($parentid)) {
            throw new \InvalidArgumentException('non-nullable parentid cannot be null');
        }
        $this->container['parentid'] = $parentid;

        return $this;
    }

    /**
     * Gets replysubject
     *
     * @return string|null
     */
    public function getReplysubject()
    {
        return $this->container['replysubject'];
    }

    /**
     * Sets replysubject
     *
     * @param string|null $replysubject replysubject
     *
     * @return self
     */
    public function setReplysubject($replysubject)
    {
        if (is_null($replysubject)) {
            throw new \InvalidArgumentException('non-nullable replysubject cannot be null');
        }
        $this->container['replysubject'] = $replysubject;

        return $this;
    }

    /**
     * Gets subject
     *
     * @return string|null
     */
    public function getSubject()
    {
        return $this->container['subject'];
    }

    /**
     * Sets subject
     *
     * @param string|null $subject subject
     *
     * @return self
     */
    public function setSubject($subject)
    {
        if (is_null($subject)) {
            throw new \InvalidArgumentException('non-nullable subject cannot be null');
        }
        $this->container['subject'] = $subject;

        return $this;
    }

    /**
     * Gets tags
     *
     * @return \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostTagsInner[]|null
     */
    public function getTags()
    {
        return $this->container['tags'];
    }

    /**
     * Sets tags
     *
     * @param \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostTagsInner[]|null $tags tags
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
     * Gets unread
     *
     * @return bool|null
     */
    public function getUnread()
    {
        return $this->container['unread'];
    }

    /**
     * Sets unread
     *
     * @param bool|null $unread unread
     *
     * @return self
     */
    public function setUnread($unread)
    {
        if (is_null($unread)) {
            throw new \InvalidArgumentException('non-nullable unread cannot be null');
        }
        $this->container['unread'] = $unread;

        return $this;
    }

    /**
     * Gets urls
     *
     * @return \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostUrls|null
     */
    public function getUrls()
    {
        return $this->container['urls'];
    }

    /**
     * Sets urls
     *
     * @param \OpenAPI\Client\Model\ModForumGetDiscussionPost200ResponsePostUrls|null $urls urls
     *
     * @return self
     */
    public function setUrls($urls)
    {
        if (is_null($urls)) {
            throw new \InvalidArgumentException('non-nullable urls cannot be null');
        }
        $this->container['urls'] = $urls;

        return $this;
    }

    /**
     * Gets wordcount
     *
     * @return int|null
     */
    public function getWordcount()
    {
        return $this->container['wordcount'];
    }

    /**
     * Sets wordcount
     *
     * @param int|null $wordcount wordcount
     *
     * @return self
     */
    public function setWordcount($wordcount)
    {
        if (is_null($wordcount)) {
            throw new \InvalidArgumentException('non-nullable wordcount cannot be null');
        }
        $this->container['wordcount'] = $wordcount;

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


