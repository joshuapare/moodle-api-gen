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
    /// TinyAutosaveResumeSessionRequest
    /// </summary>
    [DataContract(Name = "tiny_autosave_resume_session_request")]
    public partial class TinyAutosaveResumeSessionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TinyAutosaveResumeSessionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TinyAutosaveResumeSessionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TinyAutosaveResumeSessionRequest" /> class.
        /// </summary>
        /// <param name="contextid">The context id that owns the editor (required).</param>
        /// <param name="draftid">The new draft item id to resume files to (required) (default to null).</param>
        /// <param name="elementid">The ID of the element (required).</param>
        /// <param name="pagehash">The page hash (required).</param>
        /// <param name="pageinstance">The page instance (required).</param>
        public TinyAutosaveResumeSessionRequest(int contextid = default(int), int draftid = null, string elementid = default(string), string pagehash = default(string), string pageinstance = default(string))
        {
            this.Contextid = contextid;
            this.Draftid = draftid;
            // to ensure "elementid" is required (not null)
            if (elementid == null)
            {
                throw new ArgumentNullException("elementid is a required property for TinyAutosaveResumeSessionRequest and cannot be null");
            }
            this.Elementid = elementid;
            // to ensure "pagehash" is required (not null)
            if (pagehash == null)
            {
                throw new ArgumentNullException("pagehash is a required property for TinyAutosaveResumeSessionRequest and cannot be null");
            }
            this.Pagehash = pagehash;
            // to ensure "pageinstance" is required (not null)
            if (pageinstance == null)
            {
                throw new ArgumentNullException("pageinstance is a required property for TinyAutosaveResumeSessionRequest and cannot be null");
            }
            this.Pageinstance = pageinstance;
        }

        /// <summary>
        /// The context id that owns the editor
        /// </summary>
        /// <value>The context id that owns the editor</value>
        [DataMember(Name = "contextid", IsRequired = true, EmitDefaultValue = true)]
        public int Contextid { get; set; }

        /// <summary>
        /// The new draft item id to resume files to
        /// </summary>
        /// <value>The new draft item id to resume files to</value>
        [DataMember(Name = "draftid", IsRequired = true, EmitDefaultValue = true)]
        public int Draftid { get; set; }

        /// <summary>
        /// The ID of the element
        /// </summary>
        /// <value>The ID of the element</value>
        [DataMember(Name = "elementid", IsRequired = true, EmitDefaultValue = true)]
        public string Elementid { get; set; }

        /// <summary>
        /// The page hash
        /// </summary>
        /// <value>The page hash</value>
        [DataMember(Name = "pagehash", IsRequired = true, EmitDefaultValue = true)]
        public string Pagehash { get; set; }

        /// <summary>
        /// The page instance
        /// </summary>
        /// <value>The page instance</value>
        [DataMember(Name = "pageinstance", IsRequired = true, EmitDefaultValue = true)]
        public string Pageinstance { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TinyAutosaveResumeSessionRequest {\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
            sb.Append("  Draftid: ").Append(Draftid).Append("\n");
            sb.Append("  Elementid: ").Append(Elementid).Append("\n");
            sb.Append("  Pagehash: ").Append(Pagehash).Append("\n");
            sb.Append("  Pageinstance: ").Append(Pageinstance).Append("\n");
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