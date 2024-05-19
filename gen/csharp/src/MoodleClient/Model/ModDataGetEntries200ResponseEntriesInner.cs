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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModDataGetEntries200ResponseEntriesInner
    /// </summary>
    [DataContract(Name = "mod_data_get_entries_200_response_entries_inner")]
    public partial class ModDataGetEntries200ResponseEntriesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModDataGetEntries200ResponseEntriesInner" /> class.
        /// </summary>
        /// <param name="approved">Whether the entry has been approved (if the database is configured in that way). (default to 0).</param>
        /// <param name="canmanageentry">Whether the current user can manage this entry (default to null).</param>
        /// <param name="contents">contents.</param>
        /// <param name="dataid">The database id this record belongs to. (default to 0).</param>
        /// <param name="fullname">The user who created the entry fullname. (default to &quot;null&quot;).</param>
        /// <param name="groupid">The group id this record belongs to (0 for no groups). (default to 0).</param>
        /// <param name="id">Record id. (default to null).</param>
        /// <param name="tags">tags.</param>
        /// <param name="timecreated">Time the record was created. (default to 0).</param>
        /// <param name="timemodified">Last time the record was modified. (default to 0).</param>
        /// <param name="userid">The id of the user who created the record. (default to 0).</param>
        public ModDataGetEntries200ResponseEntriesInner(bool approved = 0, bool canmanageentry = null, List<ModDataGetEntries200ResponseEntriesInnerContentsInner> contents = default(List<ModDataGetEntries200ResponseEntriesInnerContentsInner>), int dataid = 0, string fullname = @"null", int groupid = 0, int id = null, List<ModDataGetEntries200ResponseEntriesInnerTagsInner> tags = default(List<ModDataGetEntries200ResponseEntriesInnerTagsInner>), int timecreated = 0, int timemodified = 0, int userid = 0)
        {
            this.Approved = approved;
            this.Canmanageentry = canmanageentry;
            this.Contents = contents;
            this.Dataid = dataid;
            // use default value if no "fullname" provided
            this.Fullname = fullname ?? @"null";
            this.Groupid = groupid;
            this.Id = id;
            this.Tags = tags;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Userid = userid;
        }

        /// <summary>
        /// Whether the entry has been approved (if the database is configured in that way).
        /// </summary>
        /// <value>Whether the entry has been approved (if the database is configured in that way).</value>
        [DataMember(Name = "approved", EmitDefaultValue = true)]
        public bool Approved { get; set; }

        /// <summary>
        /// Whether the current user can manage this entry
        /// </summary>
        /// <value>Whether the current user can manage this entry</value>
        [DataMember(Name = "canmanageentry", EmitDefaultValue = true)]
        public bool Canmanageentry { get; set; }

        /// <summary>
        /// Gets or Sets Contents
        /// </summary>
        [DataMember(Name = "contents", EmitDefaultValue = false)]
        public List<ModDataGetEntries200ResponseEntriesInnerContentsInner> Contents { get; set; }

        /// <summary>
        /// The database id this record belongs to.
        /// </summary>
        /// <value>The database id this record belongs to.</value>
        [DataMember(Name = "dataid", EmitDefaultValue = false)]
        public int Dataid { get; set; }

        /// <summary>
        /// The user who created the entry fullname.
        /// </summary>
        /// <value>The user who created the entry fullname.</value>
        [DataMember(Name = "fullname", EmitDefaultValue = false)]
        public string Fullname { get; set; }

        /// <summary>
        /// The group id this record belongs to (0 for no groups).
        /// </summary>
        /// <value>The group id this record belongs to (0 for no groups).</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// Record id.
        /// </summary>
        /// <value>Record id.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name = "tags", EmitDefaultValue = false)]
        public List<ModDataGetEntries200ResponseEntriesInnerTagsInner> Tags { get; set; }

        /// <summary>
        /// Time the record was created.
        /// </summary>
        /// <value>Time the record was created.</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// Last time the record was modified.
        /// </summary>
        /// <value>Last time the record was modified.</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// The id of the user who created the record.
        /// </summary>
        /// <value>The id of the user who created the record.</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModDataGetEntries200ResponseEntriesInner {\n");
            sb.Append("  Approved: ").Append(Approved).Append("\n");
            sb.Append("  Canmanageentry: ").Append(Canmanageentry).Append("\n");
            sb.Append("  Contents: ").Append(Contents).Append("\n");
            sb.Append("  Dataid: ").Append(Dataid).Append("\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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