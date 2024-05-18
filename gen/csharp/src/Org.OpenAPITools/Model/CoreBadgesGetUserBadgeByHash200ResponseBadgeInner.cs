/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreBadgesGetUserBadgeByHash200ResponseBadgeInner
    /// </summary>
    [DataContract(Name = "core_badges_get_user_badge_by_hash_200_response_badge_inner")]
    public partial class CoreBadgesGetUserBadgeByHash200ResponseBadgeInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBadgesGetUserBadgeByHash200ResponseBadgeInner" /> class.
        /// </summary>
        /// <param name="alignment">alignment.</param>
        /// <param name="attachment">Attachment (default to 1).</param>
        /// <param name="badgeurl">Badge URL (default to &quot;null&quot;).</param>
        /// <param name="courseid">Course id (default to null).</param>
        /// <param name="dateexpire">Date expire (default to null).</param>
        /// <param name="dateissued">Date issued (default to 0).</param>
        /// <param name="description">Badge description (default to &quot;null&quot;).</param>
        /// <param name="email">User email (default to &quot;null&quot;).</param>
        /// <param name="endorsement">endorsement.</param>
        /// <param name="expiredate">Expire date (default to null).</param>
        /// <param name="expireperiod">Expire period (default to null).</param>
        /// <param name="id">Badge id.</param>
        /// <param name="imageauthoremail">Email of the image author (default to &quot;null&quot;).</param>
        /// <param name="imageauthorname">Name of the image author (default to &quot;null&quot;).</param>
        /// <param name="imageauthorurl">URL of the image author (default to &quot;null&quot;).</param>
        /// <param name="imagecaption">Caption of the image (default to &quot;null&quot;).</param>
        /// <param name="issuedid">Issued id (default to null).</param>
        /// <param name="issuercontact">Issuer contact (default to &quot;null&quot;).</param>
        /// <param name="issuername">Issuer name (default to &quot;null&quot;).</param>
        /// <param name="issuerurl">Issuer URL (default to &quot;null&quot;).</param>
        /// <param name="language">Language (default to &quot;null&quot;).</param>
        /// <param name="message">Message (default to &quot;null&quot;).</param>
        /// <param name="messagesubject">Message subject (default to &quot;null&quot;).</param>
        /// <param name="name">Badge name (default to &quot;null&quot;).</param>
        /// <param name="nextcron">Next cron (default to null).</param>
        /// <param name="notification">Whether to notify when badge is awarded (default to 1).</param>
        /// <param name="relatedbadges">relatedbadges.</param>
        /// <param name="status">Status (default to 0).</param>
        /// <param name="timecreated">Time created (default to 0).</param>
        /// <param name="timemodified">Time modified (default to 0).</param>
        /// <param name="type">Type (default to 1).</param>
        /// <param name="uniquehash">Unique hash (default to &quot;null&quot;).</param>
        /// <param name="usercreated">User created (default to null).</param>
        /// <param name="usermodified">User modified (default to null).</param>
        /// <param name="varVersion">Version.</param>
        /// <param name="visible">Visible (default to 0).</param>
        public CoreBadgesGetUserBadgeByHash200ResponseBadgeInner(List<CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner> alignment = default(List<CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner>), int attachment = 1, string badgeurl = @"null", int courseid = null, int dateexpire = null, int dateissued = 0, string description = @"null", string email = @"null", CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement endorsement = default(CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement), int expiredate = null, int expireperiod = null, int id = default(int), string imageauthoremail = @"null", string imageauthorname = @"null", string imageauthorurl = @"null", string imagecaption = @"null", int issuedid = null, string issuercontact = @"null", string issuername = @"null", string issuerurl = @"null", string language = @"null", string message = @"null", string messagesubject = @"null", string name = @"null", int nextcron = null, int notification = 1, List<CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner> relatedbadges = default(List<CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner>), int status = 0, int timecreated = 0, int timemodified = 0, int type = 1, string uniquehash = @"null", int usercreated = null, int usermodified = null, string varVersion = default(string), int visible = 0)
        {
            this.Alignment = alignment;
            this.Attachment = attachment;
            // use default value if no "badgeurl" provided
            this.Badgeurl = badgeurl ?? @"null";
            this.Courseid = courseid;
            this.Dateexpire = dateexpire;
            this.Dateissued = dateissued;
            // use default value if no "description" provided
            this.Description = description ?? @"null";
            // use default value if no "email" provided
            this.Email = email ?? @"null";
            this.Endorsement = endorsement;
            this.Expiredate = expiredate;
            this.Expireperiod = expireperiod;
            this.Id = id;
            // use default value if no "imageauthoremail" provided
            this.Imageauthoremail = imageauthoremail ?? @"null";
            // use default value if no "imageauthorname" provided
            this.Imageauthorname = imageauthorname ?? @"null";
            // use default value if no "imageauthorurl" provided
            this.Imageauthorurl = imageauthorurl ?? @"null";
            // use default value if no "imagecaption" provided
            this.Imagecaption = imagecaption ?? @"null";
            this.Issuedid = issuedid;
            // use default value if no "issuercontact" provided
            this.Issuercontact = issuercontact ?? @"null";
            // use default value if no "issuername" provided
            this.Issuername = issuername ?? @"null";
            // use default value if no "issuerurl" provided
            this.Issuerurl = issuerurl ?? @"null";
            // use default value if no "language" provided
            this.Language = language ?? @"null";
            // use default value if no "message" provided
            this.Message = message ?? @"null";
            // use default value if no "messagesubject" provided
            this.Messagesubject = messagesubject ?? @"null";
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            this.Nextcron = nextcron;
            this.Notification = notification;
            this.Relatedbadges = relatedbadges;
            this.Status = status;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Type = type;
            // use default value if no "uniquehash" provided
            this.Uniquehash = uniquehash ?? @"null";
            this.Usercreated = usercreated;
            this.Usermodified = usermodified;
            this.VarVersion = varVersion;
            this.Visible = visible;
        }

        /// <summary>
        /// Gets or Sets Alignment
        /// </summary>
        [DataMember(Name = "alignment", EmitDefaultValue = false)]
        public List<CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner> Alignment { get; set; }

        /// <summary>
        /// Attachment
        /// </summary>
        /// <value>Attachment</value>
        [DataMember(Name = "attachment", EmitDefaultValue = false)]
        public int Attachment { get; set; }

        /// <summary>
        /// Badge URL
        /// </summary>
        /// <value>Badge URL</value>
        [DataMember(Name = "badgeurl", EmitDefaultValue = false)]
        public string Badgeurl { get; set; }

        /// <summary>
        /// Course id
        /// </summary>
        /// <value>Course id</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// Date expire
        /// </summary>
        /// <value>Date expire</value>
        [DataMember(Name = "dateexpire", EmitDefaultValue = false)]
        public int Dateexpire { get; set; }

        /// <summary>
        /// Date issued
        /// </summary>
        /// <value>Date issued</value>
        [DataMember(Name = "dateissued", EmitDefaultValue = false)]
        public int Dateissued { get; set; }

        /// <summary>
        /// Badge description
        /// </summary>
        /// <value>Badge description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// User email
        /// </summary>
        /// <value>User email</value>
        [DataMember(Name = "email", EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets Endorsement
        /// </summary>
        [DataMember(Name = "endorsement", EmitDefaultValue = false)]
        public CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement Endorsement { get; set; }

        /// <summary>
        /// Expire date
        /// </summary>
        /// <value>Expire date</value>
        [DataMember(Name = "expiredate", EmitDefaultValue = false)]
        public int Expiredate { get; set; }

        /// <summary>
        /// Expire period
        /// </summary>
        /// <value>Expire period</value>
        [DataMember(Name = "expireperiod", EmitDefaultValue = false)]
        public int Expireperiod { get; set; }

        /// <summary>
        /// Badge id
        /// </summary>
        /// <value>Badge id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Email of the image author
        /// </summary>
        /// <value>Email of the image author</value>
        [DataMember(Name = "imageauthoremail", EmitDefaultValue = false)]
        public string Imageauthoremail { get; set; }

        /// <summary>
        /// Name of the image author
        /// </summary>
        /// <value>Name of the image author</value>
        [DataMember(Name = "imageauthorname", EmitDefaultValue = false)]
        public string Imageauthorname { get; set; }

        /// <summary>
        /// URL of the image author
        /// </summary>
        /// <value>URL of the image author</value>
        [DataMember(Name = "imageauthorurl", EmitDefaultValue = false)]
        public string Imageauthorurl { get; set; }

        /// <summary>
        /// Caption of the image
        /// </summary>
        /// <value>Caption of the image</value>
        [DataMember(Name = "imagecaption", EmitDefaultValue = false)]
        public string Imagecaption { get; set; }

        /// <summary>
        /// Issued id
        /// </summary>
        /// <value>Issued id</value>
        [DataMember(Name = "issuedid", EmitDefaultValue = false)]
        public int Issuedid { get; set; }

        /// <summary>
        /// Issuer contact
        /// </summary>
        /// <value>Issuer contact</value>
        [DataMember(Name = "issuercontact", EmitDefaultValue = false)]
        public string Issuercontact { get; set; }

        /// <summary>
        /// Issuer name
        /// </summary>
        /// <value>Issuer name</value>
        [DataMember(Name = "issuername", EmitDefaultValue = false)]
        public string Issuername { get; set; }

        /// <summary>
        /// Issuer URL
        /// </summary>
        /// <value>Issuer URL</value>
        [DataMember(Name = "issuerurl", EmitDefaultValue = false)]
        public string Issuerurl { get; set; }

        /// <summary>
        /// Language
        /// </summary>
        /// <value>Language</value>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public string Language { get; set; }

        /// <summary>
        /// Message
        /// </summary>
        /// <value>Message</value>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// Message subject
        /// </summary>
        /// <value>Message subject</value>
        [DataMember(Name = "messagesubject", EmitDefaultValue = false)]
        public string Messagesubject { get; set; }

        /// <summary>
        /// Badge name
        /// </summary>
        /// <value>Badge name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Next cron
        /// </summary>
        /// <value>Next cron</value>
        [DataMember(Name = "nextcron", EmitDefaultValue = false)]
        public int Nextcron { get; set; }

        /// <summary>
        /// Whether to notify when badge is awarded
        /// </summary>
        /// <value>Whether to notify when badge is awarded</value>
        [DataMember(Name = "notification", EmitDefaultValue = false)]
        public int Notification { get; set; }

        /// <summary>
        /// Gets or Sets Relatedbadges
        /// </summary>
        [DataMember(Name = "relatedbadges", EmitDefaultValue = false)]
        public List<CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner> Relatedbadges { get; set; }

        /// <summary>
        /// Status
        /// </summary>
        /// <value>Status</value>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public int Status { get; set; }

        /// <summary>
        /// Time created
        /// </summary>
        /// <value>Time created</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// Time modified
        /// </summary>
        /// <value>Time modified</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Type
        /// </summary>
        /// <value>Type</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public int Type { get; set; }

        /// <summary>
        /// Unique hash
        /// </summary>
        /// <value>Unique hash</value>
        [DataMember(Name = "uniquehash", EmitDefaultValue = false)]
        public string Uniquehash { get; set; }

        /// <summary>
        /// User created
        /// </summary>
        /// <value>User created</value>
        [DataMember(Name = "usercreated", EmitDefaultValue = false)]
        public int Usercreated { get; set; }

        /// <summary>
        /// User modified
        /// </summary>
        /// <value>User modified</value>
        [DataMember(Name = "usermodified", EmitDefaultValue = false)]
        public int Usermodified { get; set; }

        /// <summary>
        /// Version
        /// </summary>
        /// <value>Version</value>
        [DataMember(Name = "version", EmitDefaultValue = false)]
        public string VarVersion { get; set; }

        /// <summary>
        /// Visible
        /// </summary>
        /// <value>Visible</value>
        [DataMember(Name = "visible", EmitDefaultValue = false)]
        public int Visible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreBadgesGetUserBadgeByHash200ResponseBadgeInner {\n");
            sb.Append("  Alignment: ").Append(Alignment).Append("\n");
            sb.Append("  Attachment: ").Append(Attachment).Append("\n");
            sb.Append("  Badgeurl: ").Append(Badgeurl).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Dateexpire: ").Append(Dateexpire).Append("\n");
            sb.Append("  Dateissued: ").Append(Dateissued).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Endorsement: ").Append(Endorsement).Append("\n");
            sb.Append("  Expiredate: ").Append(Expiredate).Append("\n");
            sb.Append("  Expireperiod: ").Append(Expireperiod).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Imageauthoremail: ").Append(Imageauthoremail).Append("\n");
            sb.Append("  Imageauthorname: ").Append(Imageauthorname).Append("\n");
            sb.Append("  Imageauthorurl: ").Append(Imageauthorurl).Append("\n");
            sb.Append("  Imagecaption: ").Append(Imagecaption).Append("\n");
            sb.Append("  Issuedid: ").Append(Issuedid).Append("\n");
            sb.Append("  Issuercontact: ").Append(Issuercontact).Append("\n");
            sb.Append("  Issuername: ").Append(Issuername).Append("\n");
            sb.Append("  Issuerurl: ").Append(Issuerurl).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Messagesubject: ").Append(Messagesubject).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Nextcron: ").Append(Nextcron).Append("\n");
            sb.Append("  Notification: ").Append(Notification).Append("\n");
            sb.Append("  Relatedbadges: ").Append(Relatedbadges).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Uniquehash: ").Append(Uniquehash).Append("\n");
            sb.Append("  Usercreated: ").Append(Usercreated).Append("\n");
            sb.Append("  Usermodified: ").Append(Usermodified).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
            sb.Append("  Visible: ").Append(Visible).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}