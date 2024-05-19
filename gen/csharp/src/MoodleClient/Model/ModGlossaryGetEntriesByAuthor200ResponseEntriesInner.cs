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
    /// ModGlossaryGetEntriesByAuthor200ResponseEntriesInner
    /// </summary>
    [DataContract(Name = "mod_glossary_get_entries_by_author_200_response_entries_inner")]
    public partial class ModGlossaryGetEntriesByAuthor200ResponseEntriesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetEntriesByAuthor200ResponseEntriesInner" /> class.
        /// </summary>
        /// <param name="approved">Whether the entry was approved (default to null).</param>
        /// <param name="attachment">Whether or not the entry has attachments (default to null).</param>
        /// <param name="attachments">attachments.</param>
        /// <param name="casesensitive">When true, the matching is case sensitive (default to null).</param>
        /// <param name="concept">The concept (default to &quot;null&quot;).</param>
        /// <param name="definition">The definition (default to &quot;null&quot;).</param>
        /// <param name="definitionformat">definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="definitioninlinefiles">definitioninlinefiles.</param>
        /// <param name="definitiontrust">The definition trust flag (default to null).</param>
        /// <param name="fullmatch">When true, the matching is done on full words only (default to null).</param>
        /// <param name="glossaryid">The glossary ID.</param>
        /// <param name="id">The entry ID (default to null).</param>
        /// <param name="sourceglossaryid">The source glossary ID (default to null).</param>
        /// <param name="tags">tags.</param>
        /// <param name="teacherentry">The entry was created by a teacher, or equivalent. (default to null).</param>
        /// <param name="timecreated">Time created.</param>
        /// <param name="timemodified">Time modified.</param>
        /// <param name="usedynalink">Whether the concept should be automatically linked (default to null).</param>
        /// <param name="userfullname">Author full name (default to &quot;null&quot;).</param>
        /// <param name="userid">Author ID (default to null).</param>
        /// <param name="userpictureurl">Author picture (default to &quot;null&quot;).</param>
        public ModGlossaryGetEntriesByAuthor200ResponseEntriesInner(bool approved = null, bool attachment = null, List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> attachments = default(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>), bool casesensitive = null, string concept = @"null", string definition = @"null", int definitionformat = default(int), List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> definitioninlinefiles = default(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>), bool definitiontrust = null, bool fullmatch = null, int glossaryid = default(int), int id = null, int sourceglossaryid = null, List<ModDataGetEntries200ResponseEntriesInnerTagsInner> tags = default(List<ModDataGetEntries200ResponseEntriesInnerTagsInner>), bool teacherentry = null, int timecreated = default(int), int timemodified = default(int), bool usedynalink = null, string userfullname = @"null", int userid = null, string userpictureurl = @"null")
        {
            this.Approved = approved;
            this.Attachment = attachment;
            this.Attachments = attachments;
            this.Casesensitive = casesensitive;
            // use default value if no "concept" provided
            this.Concept = concept ?? @"null";
            // use default value if no "definition" provided
            this.Definition = definition ?? @"null";
            this.Definitionformat = definitionformat;
            this.Definitioninlinefiles = definitioninlinefiles;
            this.Definitiontrust = definitiontrust;
            this.Fullmatch = fullmatch;
            this.Glossaryid = glossaryid;
            this.Id = id;
            this.Sourceglossaryid = sourceglossaryid;
            this.Tags = tags;
            this.Teacherentry = teacherentry;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Usedynalink = usedynalink;
            // use default value if no "userfullname" provided
            this.Userfullname = userfullname ?? @"null";
            this.Userid = userid;
            // use default value if no "userpictureurl" provided
            this.Userpictureurl = userpictureurl ?? @"null";
        }

        /// <summary>
        /// Whether the entry was approved
        /// </summary>
        /// <value>Whether the entry was approved</value>
        [DataMember(Name = "approved", EmitDefaultValue = true)]
        public bool Approved { get; set; }

        /// <summary>
        /// Whether or not the entry has attachments
        /// </summary>
        /// <value>Whether or not the entry has attachments</value>
        [DataMember(Name = "attachment", EmitDefaultValue = true)]
        public bool Attachment { get; set; }

        /// <summary>
        /// Gets or Sets Attachments
        /// </summary>
        [DataMember(Name = "attachments", EmitDefaultValue = false)]
        public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> Attachments { get; set; }

        /// <summary>
        /// When true, the matching is case sensitive
        /// </summary>
        /// <value>When true, the matching is case sensitive</value>
        [DataMember(Name = "casesensitive", EmitDefaultValue = true)]
        public bool Casesensitive { get; set; }

        /// <summary>
        /// The concept
        /// </summary>
        /// <value>The concept</value>
        [DataMember(Name = "concept", EmitDefaultValue = false)]
        public string Concept { get; set; }

        /// <summary>
        /// The definition
        /// </summary>
        /// <value>The definition</value>
        [DataMember(Name = "definition", EmitDefaultValue = false)]
        public string Definition { get; set; }

        /// <summary>
        /// definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "definitionformat", EmitDefaultValue = false)]
        public int Definitionformat { get; set; }

        /// <summary>
        /// Gets or Sets Definitioninlinefiles
        /// </summary>
        [DataMember(Name = "definitioninlinefiles", EmitDefaultValue = false)]
        public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> Definitioninlinefiles { get; set; }

        /// <summary>
        /// The definition trust flag
        /// </summary>
        /// <value>The definition trust flag</value>
        [DataMember(Name = "definitiontrust", EmitDefaultValue = true)]
        public bool Definitiontrust { get; set; }

        /// <summary>
        /// When true, the matching is done on full words only
        /// </summary>
        /// <value>When true, the matching is done on full words only</value>
        [DataMember(Name = "fullmatch", EmitDefaultValue = true)]
        public bool Fullmatch { get; set; }

        /// <summary>
        /// The glossary ID
        /// </summary>
        /// <value>The glossary ID</value>
        [DataMember(Name = "glossaryid", EmitDefaultValue = false)]
        public int Glossaryid { get; set; }

        /// <summary>
        /// The entry ID
        /// </summary>
        /// <value>The entry ID</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// The source glossary ID
        /// </summary>
        /// <value>The source glossary ID</value>
        [DataMember(Name = "sourceglossaryid", EmitDefaultValue = false)]
        public int Sourceglossaryid { get; set; }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name = "tags", EmitDefaultValue = false)]
        public List<ModDataGetEntries200ResponseEntriesInnerTagsInner> Tags { get; set; }

        /// <summary>
        /// The entry was created by a teacher, or equivalent.
        /// </summary>
        /// <value>The entry was created by a teacher, or equivalent.</value>
        [DataMember(Name = "teacherentry", EmitDefaultValue = true)]
        public bool Teacherentry { get; set; }

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
        /// Whether the concept should be automatically linked
        /// </summary>
        /// <value>Whether the concept should be automatically linked</value>
        [DataMember(Name = "usedynalink", EmitDefaultValue = true)]
        public bool Usedynalink { get; set; }

        /// <summary>
        /// Author full name
        /// </summary>
        /// <value>Author full name</value>
        [DataMember(Name = "userfullname", EmitDefaultValue = false)]
        public string Userfullname { get; set; }

        /// <summary>
        /// Author ID
        /// </summary>
        /// <value>Author ID</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Author picture
        /// </summary>
        /// <value>Author picture</value>
        [DataMember(Name = "userpictureurl", EmitDefaultValue = false)]
        public string Userpictureurl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModGlossaryGetEntriesByAuthor200ResponseEntriesInner {\n");
            sb.Append("  Approved: ").Append(Approved).Append("\n");
            sb.Append("  Attachment: ").Append(Attachment).Append("\n");
            sb.Append("  Attachments: ").Append(Attachments).Append("\n");
            sb.Append("  Casesensitive: ").Append(Casesensitive).Append("\n");
            sb.Append("  Concept: ").Append(Concept).Append("\n");
            sb.Append("  Definition: ").Append(Definition).Append("\n");
            sb.Append("  Definitionformat: ").Append(Definitionformat).Append("\n");
            sb.Append("  Definitioninlinefiles: ").Append(Definitioninlinefiles).Append("\n");
            sb.Append("  Definitiontrust: ").Append(Definitiontrust).Append("\n");
            sb.Append("  Fullmatch: ").Append(Fullmatch).Append("\n");
            sb.Append("  Glossaryid: ").Append(Glossaryid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Sourceglossaryid: ").Append(Sourceglossaryid).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Teacherentry: ").Append(Teacherentry).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Usedynalink: ").Append(Usedynalink).Append("\n");
            sb.Append("  Userfullname: ").Append(Userfullname).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("  Userpictureurl: ").Append(Userpictureurl).Append("\n");
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
