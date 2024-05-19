<?php
/**
 * ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner
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
 * ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner Class Doc Comment
 *
 * @category Class
 * @description post
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_forum_get_forum_discussions_paginated_200_response_discussions_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'attachment' => 'string',
        'attachments' => '\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]',
        'canlock' => 'bool',
        'canreply' => 'bool',
        'created' => 'int',
        'discussion' => 'int',
        'groupid' => 'int',
        'id' => 'int',
        'locked' => 'bool',
        'mailed' => 'int',
        'mailnow' => 'int',
        'message' => 'string',
        'messageformat' => 'int',
        'messageinlinefiles' => '\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]',
        'messagetrust' => 'int',
        'modified' => 'int',
        'name' => 'string',
        'numreplies' => 'int',
        'numunread' => 'int',
        'parent' => 'int',
        'pinned' => 'bool',
        'subject' => 'string',
        'timeend' => 'int',
        'timemodified' => 'int',
        'timestart' => 'int',
        'totalscore' => 'int',
        'userfullname' => 'string',
        'userid' => 'int',
        'usermodified' => 'int',
        'usermodifiedfullname' => 'string',
        'usermodifiedpictureurl' => 'string',
        'userpictureurl' => 'string'
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
        'attachments' => null,
        'canlock' => null,
        'canreply' => null,
        'created' => null,
        'discussion' => null,
        'groupid' => null,
        'id' => null,
        'locked' => null,
        'mailed' => null,
        'mailnow' => null,
        'message' => null,
        'messageformat' => null,
        'messageinlinefiles' => null,
        'messagetrust' => null,
        'modified' => null,
        'name' => null,
        'numreplies' => null,
        'numunread' => null,
        'parent' => null,
        'pinned' => null,
        'subject' => null,
        'timeend' => null,
        'timemodified' => null,
        'timestart' => null,
        'totalscore' => null,
        'userfullname' => null,
        'userid' => null,
        'usermodified' => null,
        'usermodifiedfullname' => null,
        'usermodifiedpictureurl' => null,
        'userpictureurl' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'attachment' => false,
        'attachments' => false,
        'canlock' => false,
        'canreply' => false,
        'created' => false,
        'discussion' => false,
        'groupid' => false,
        'id' => false,
        'locked' => false,
        'mailed' => false,
        'mailnow' => false,
        'message' => false,
        'messageformat' => false,
        'messageinlinefiles' => false,
        'messagetrust' => false,
        'modified' => false,
        'name' => false,
        'numreplies' => false,
        'numunread' => false,
        'parent' => false,
        'pinned' => false,
        'subject' => false,
        'timeend' => false,
        'timemodified' => false,
        'timestart' => false,
        'totalscore' => false,
        'userfullname' => false,
        'userid' => false,
        'usermodified' => false,
        'usermodifiedfullname' => false,
        'usermodifiedpictureurl' => false,
        'userpictureurl' => false
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
        'attachments' => 'attachments',
        'canlock' => 'canlock',
        'canreply' => 'canreply',
        'created' => 'created',
        'discussion' => 'discussion',
        'groupid' => 'groupid',
        'id' => 'id',
        'locked' => 'locked',
        'mailed' => 'mailed',
        'mailnow' => 'mailnow',
        'message' => 'message',
        'messageformat' => 'messageformat',
        'messageinlinefiles' => 'messageinlinefiles',
        'messagetrust' => 'messagetrust',
        'modified' => 'modified',
        'name' => 'name',
        'numreplies' => 'numreplies',
        'numunread' => 'numunread',
        'parent' => 'parent',
        'pinned' => 'pinned',
        'subject' => 'subject',
        'timeend' => 'timeend',
        'timemodified' => 'timemodified',
        'timestart' => 'timestart',
        'totalscore' => 'totalscore',
        'userfullname' => 'userfullname',
        'userid' => 'userid',
        'usermodified' => 'usermodified',
        'usermodifiedfullname' => 'usermodifiedfullname',
        'usermodifiedpictureurl' => 'usermodifiedpictureurl',
        'userpictureurl' => 'userpictureurl'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'attachment' => 'setAttachment',
        'attachments' => 'setAttachments',
        'canlock' => 'setCanlock',
        'canreply' => 'setCanreply',
        'created' => 'setCreated',
        'discussion' => 'setDiscussion',
        'groupid' => 'setGroupid',
        'id' => 'setId',
        'locked' => 'setLocked',
        'mailed' => 'setMailed',
        'mailnow' => 'setMailnow',
        'message' => 'setMessage',
        'messageformat' => 'setMessageformat',
        'messageinlinefiles' => 'setMessageinlinefiles',
        'messagetrust' => 'setMessagetrust',
        'modified' => 'setModified',
        'name' => 'setName',
        'numreplies' => 'setNumreplies',
        'numunread' => 'setNumunread',
        'parent' => 'setParent',
        'pinned' => 'setPinned',
        'subject' => 'setSubject',
        'timeend' => 'setTimeend',
        'timemodified' => 'setTimemodified',
        'timestart' => 'setTimestart',
        'totalscore' => 'setTotalscore',
        'userfullname' => 'setUserfullname',
        'userid' => 'setUserid',
        'usermodified' => 'setUsermodified',
        'usermodifiedfullname' => 'setUsermodifiedfullname',
        'usermodifiedpictureurl' => 'setUsermodifiedpictureurl',
        'userpictureurl' => 'setUserpictureurl'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'attachment' => 'getAttachment',
        'attachments' => 'getAttachments',
        'canlock' => 'getCanlock',
        'canreply' => 'getCanreply',
        'created' => 'getCreated',
        'discussion' => 'getDiscussion',
        'groupid' => 'getGroupid',
        'id' => 'getId',
        'locked' => 'getLocked',
        'mailed' => 'getMailed',
        'mailnow' => 'getMailnow',
        'message' => 'getMessage',
        'messageformat' => 'getMessageformat',
        'messageinlinefiles' => 'getMessageinlinefiles',
        'messagetrust' => 'getMessagetrust',
        'modified' => 'getModified',
        'name' => 'getName',
        'numreplies' => 'getNumreplies',
        'numunread' => 'getNumunread',
        'parent' => 'getParent',
        'pinned' => 'getPinned',
        'subject' => 'getSubject',
        'timeend' => 'getTimeend',
        'timemodified' => 'getTimemodified',
        'timestart' => 'getTimestart',
        'totalscore' => 'getTotalscore',
        'userfullname' => 'getUserfullname',
        'userid' => 'getUserid',
        'usermodified' => 'getUsermodified',
        'usermodifiedfullname' => 'getUsermodifiedfullname',
        'usermodifiedpictureurl' => 'getUsermodifiedpictureurl',
        'userpictureurl' => 'getUserpictureurl'
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
        $this->setIfExists('attachment', $data ?? [], null);
        $this->setIfExists('attachments', $data ?? [], null);
        $this->setIfExists('canlock', $data ?? [], null);
        $this->setIfExists('canreply', $data ?? [], null);
        $this->setIfExists('created', $data ?? [], null);
        $this->setIfExists('discussion', $data ?? [], null);
        $this->setIfExists('groupid', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('locked', $data ?? [], null);
        $this->setIfExists('mailed', $data ?? [], null);
        $this->setIfExists('mailnow', $data ?? [], null);
        $this->setIfExists('message', $data ?? [], null);
        $this->setIfExists('messageformat', $data ?? [], null);
        $this->setIfExists('messageinlinefiles', $data ?? [], null);
        $this->setIfExists('messagetrust', $data ?? [], null);
        $this->setIfExists('modified', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('numreplies', $data ?? [], null);
        $this->setIfExists('numunread', $data ?? [], null);
        $this->setIfExists('parent', $data ?? [], null);
        $this->setIfExists('pinned', $data ?? [], null);
        $this->setIfExists('subject', $data ?? [], null);
        $this->setIfExists('timeend', $data ?? [], null);
        $this->setIfExists('timemodified', $data ?? [], null);
        $this->setIfExists('timestart', $data ?? [], null);
        $this->setIfExists('totalscore', $data ?? [], null);
        $this->setIfExists('userfullname', $data ?? [], null);
        $this->setIfExists('userid', $data ?? [], null);
        $this->setIfExists('usermodified', $data ?? [], null);
        $this->setIfExists('usermodifiedfullname', $data ?? [], null);
        $this->setIfExists('usermodifiedpictureurl', $data ?? [], null);
        $this->setIfExists('userpictureurl', $data ?? [], null);
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
     * @return string|null
     */
    public function getAttachment()
    {
        return $this->container['attachment'];
    }

    /**
     * Sets attachment
     *
     * @param string|null $attachment Has attachments?
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
     * Gets attachments
     *
     * @return \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null
     */
    public function getAttachments()
    {
        return $this->container['attachments'];
    }

    /**
     * Sets attachments
     *
     * @param \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null $attachments attachments
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
     * Gets canlock
     *
     * @return bool|null
     */
    public function getCanlock()
    {
        return $this->container['canlock'];
    }

    /**
     * Sets canlock
     *
     * @param bool|null $canlock Can the user lock the discussion
     *
     * @return self
     */
    public function setCanlock($canlock)
    {
        if (is_null($canlock)) {
            throw new \InvalidArgumentException('non-nullable canlock cannot be null');
        }
        $this->container['canlock'] = $canlock;

        return $this;
    }

    /**
     * Gets canreply
     *
     * @return bool|null
     */
    public function getCanreply()
    {
        return $this->container['canreply'];
    }

    /**
     * Sets canreply
     *
     * @param bool|null $canreply Can the user reply to the discussion
     *
     * @return self
     */
    public function setCanreply($canreply)
    {
        if (is_null($canreply)) {
            throw new \InvalidArgumentException('non-nullable canreply cannot be null');
        }
        $this->container['canreply'] = $canreply;

        return $this;
    }

    /**
     * Gets created
     *
     * @return int|null
     */
    public function getCreated()
    {
        return $this->container['created'];
    }

    /**
     * Sets created
     *
     * @param int|null $created Creation time
     *
     * @return self
     */
    public function setCreated($created)
    {
        if (is_null($created)) {
            throw new \InvalidArgumentException('non-nullable created cannot be null');
        }
        $this->container['created'] = $created;

        return $this;
    }

    /**
     * Gets discussion
     *
     * @return int|null
     */
    public function getDiscussion()
    {
        return $this->container['discussion'];
    }

    /**
     * Sets discussion
     *
     * @param int|null $discussion Discussion id
     *
     * @return self
     */
    public function setDiscussion($discussion)
    {
        if (is_null($discussion)) {
            throw new \InvalidArgumentException('non-nullable discussion cannot be null');
        }
        $this->container['discussion'] = $discussion;

        return $this;
    }

    /**
     * Gets groupid
     *
     * @return int|null
     */
    public function getGroupid()
    {
        return $this->container['groupid'];
    }

    /**
     * Sets groupid
     *
     * @param int|null $groupid Group id
     *
     * @return self
     */
    public function setGroupid($groupid)
    {
        if (is_null($groupid)) {
            throw new \InvalidArgumentException('non-nullable groupid cannot be null');
        }
        $this->container['groupid'] = $groupid;

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
     * @param int|null $id Post id
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
     * Gets locked
     *
     * @return bool|null
     */
    public function getLocked()
    {
        return $this->container['locked'];
    }

    /**
     * Sets locked
     *
     * @param bool|null $locked Is the discussion locked
     *
     * @return self
     */
    public function setLocked($locked)
    {
        if (is_null($locked)) {
            throw new \InvalidArgumentException('non-nullable locked cannot be null');
        }
        $this->container['locked'] = $locked;

        return $this;
    }

    /**
     * Gets mailed
     *
     * @return int|null
     */
    public function getMailed()
    {
        return $this->container['mailed'];
    }

    /**
     * Sets mailed
     *
     * @param int|null $mailed Mailed?
     *
     * @return self
     */
    public function setMailed($mailed)
    {
        if (is_null($mailed)) {
            throw new \InvalidArgumentException('non-nullable mailed cannot be null');
        }
        $this->container['mailed'] = $mailed;

        return $this;
    }

    /**
     * Gets mailnow
     *
     * @return int|null
     */
    public function getMailnow()
    {
        return $this->container['mailnow'];
    }

    /**
     * Sets mailnow
     *
     * @param int|null $mailnow Mail now?
     *
     * @return self
     */
    public function setMailnow($mailnow)
    {
        if (is_null($mailnow)) {
            throw new \InvalidArgumentException('non-nullable mailnow cannot be null');
        }
        $this->container['mailnow'] = $mailnow;

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
     * @param string|null $message The post message
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
     * @return \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null
     */
    public function getMessageinlinefiles()
    {
        return $this->container['messageinlinefiles'];
    }

    /**
     * Sets messageinlinefiles
     *
     * @param \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null $messageinlinefiles messageinlinefiles
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
     * Gets messagetrust
     *
     * @return int|null
     */
    public function getMessagetrust()
    {
        return $this->container['messagetrust'];
    }

    /**
     * Sets messagetrust
     *
     * @param int|null $messagetrust Can we trust?
     *
     * @return self
     */
    public function setMessagetrust($messagetrust)
    {
        if (is_null($messagetrust)) {
            throw new \InvalidArgumentException('non-nullable messagetrust cannot be null');
        }
        $this->container['messagetrust'] = $messagetrust;

        return $this;
    }

    /**
     * Gets modified
     *
     * @return int|null
     */
    public function getModified()
    {
        return $this->container['modified'];
    }

    /**
     * Sets modified
     *
     * @param int|null $modified Time modified
     *
     * @return self
     */
    public function setModified($modified)
    {
        if (is_null($modified)) {
            throw new \InvalidArgumentException('non-nullable modified cannot be null');
        }
        $this->container['modified'] = $modified;

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
     * @param string|null $name Discussion name
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
     * Gets numreplies
     *
     * @return int|null
     */
    public function getNumreplies()
    {
        return $this->container['numreplies'];
    }

    /**
     * Sets numreplies
     *
     * @param int|null $numreplies The number of replies in the discussion
     *
     * @return self
     */
    public function setNumreplies($numreplies)
    {
        if (is_null($numreplies)) {
            throw new \InvalidArgumentException('non-nullable numreplies cannot be null');
        }
        $this->container['numreplies'] = $numreplies;

        return $this;
    }

    /**
     * Gets numunread
     *
     * @return int|null
     */
    public function getNumunread()
    {
        return $this->container['numunread'];
    }

    /**
     * Sets numunread
     *
     * @param int|null $numunread The number of unread discussions.
     *
     * @return self
     */
    public function setNumunread($numunread)
    {
        if (is_null($numunread)) {
            throw new \InvalidArgumentException('non-nullable numunread cannot be null');
        }
        $this->container['numunread'] = $numunread;

        return $this;
    }

    /**
     * Gets parent
     *
     * @return int|null
     */
    public function getParent()
    {
        return $this->container['parent'];
    }

    /**
     * Sets parent
     *
     * @param int|null $parent Parent id
     *
     * @return self
     */
    public function setParent($parent)
    {
        if (is_null($parent)) {
            throw new \InvalidArgumentException('non-nullable parent cannot be null');
        }
        $this->container['parent'] = $parent;

        return $this;
    }

    /**
     * Gets pinned
     *
     * @return bool|null
     */
    public function getPinned()
    {
        return $this->container['pinned'];
    }

    /**
     * Sets pinned
     *
     * @param bool|null $pinned Is the discussion pinned
     *
     * @return self
     */
    public function setPinned($pinned)
    {
        if (is_null($pinned)) {
            throw new \InvalidArgumentException('non-nullable pinned cannot be null');
        }
        $this->container['pinned'] = $pinned;

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
     * @param string|null $subject The post subject
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
     * Gets timeend
     *
     * @return int|null
     */
    public function getTimeend()
    {
        return $this->container['timeend'];
    }

    /**
     * Sets timeend
     *
     * @param int|null $timeend Time discussion ends
     *
     * @return self
     */
    public function setTimeend($timeend)
    {
        if (is_null($timeend)) {
            throw new \InvalidArgumentException('non-nullable timeend cannot be null');
        }
        $this->container['timeend'] = $timeend;

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
     * @param int|null $timemodified Time modified
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
     * Gets timestart
     *
     * @return int|null
     */
    public function getTimestart()
    {
        return $this->container['timestart'];
    }

    /**
     * Sets timestart
     *
     * @param int|null $timestart Time discussion can start
     *
     * @return self
     */
    public function setTimestart($timestart)
    {
        if (is_null($timestart)) {
            throw new \InvalidArgumentException('non-nullable timestart cannot be null');
        }
        $this->container['timestart'] = $timestart;

        return $this;
    }

    /**
     * Gets totalscore
     *
     * @return int|null
     */
    public function getTotalscore()
    {
        return $this->container['totalscore'];
    }

    /**
     * Sets totalscore
     *
     * @param int|null $totalscore The post message total score
     *
     * @return self
     */
    public function setTotalscore($totalscore)
    {
        if (is_null($totalscore)) {
            throw new \InvalidArgumentException('non-nullable totalscore cannot be null');
        }
        $this->container['totalscore'] = $totalscore;

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
     * @param string|null $userfullname Post author full name
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
     * @param int|null $userid User who started the discussion id
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
     * @param int|null $usermodified The id of the user who last modified
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
     * Gets usermodifiedfullname
     *
     * @return string|null
     */
    public function getUsermodifiedfullname()
    {
        return $this->container['usermodifiedfullname'];
    }

    /**
     * Sets usermodifiedfullname
     *
     * @param string|null $usermodifiedfullname Post modifier full name
     *
     * @return self
     */
    public function setUsermodifiedfullname($usermodifiedfullname)
    {
        if (is_null($usermodifiedfullname)) {
            throw new \InvalidArgumentException('non-nullable usermodifiedfullname cannot be null');
        }
        $this->container['usermodifiedfullname'] = $usermodifiedfullname;

        return $this;
    }

    /**
     * Gets usermodifiedpictureurl
     *
     * @return string|null
     */
    public function getUsermodifiedpictureurl()
    {
        return $this->container['usermodifiedpictureurl'];
    }

    /**
     * Sets usermodifiedpictureurl
     *
     * @param string|null $usermodifiedpictureurl Post modifier picture.
     *
     * @return self
     */
    public function setUsermodifiedpictureurl($usermodifiedpictureurl)
    {
        if (is_null($usermodifiedpictureurl)) {
            throw new \InvalidArgumentException('non-nullable usermodifiedpictureurl cannot be null');
        }
        $this->container['usermodifiedpictureurl'] = $usermodifiedpictureurl;

        return $this;
    }

    /**
     * Gets userpictureurl
     *
     * @return string|null
     */
    public function getUserpictureurl()
    {
        return $this->container['userpictureurl'];
    }

    /**
     * Sets userpictureurl
     *
     * @param string|null $userpictureurl Post author picture.
     *
     * @return self
     */
    public function setUserpictureurl($userpictureurl)
    {
        if (is_null($userpictureurl)) {
            throw new \InvalidArgumentException('non-nullable userpictureurl cannot be null');
        }
        $this->container['userpictureurl'] = $userpictureurl;

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


