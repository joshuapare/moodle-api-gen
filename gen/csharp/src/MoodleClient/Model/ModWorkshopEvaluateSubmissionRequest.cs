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
    /// ModWorkshopEvaluateSubmissionRequest
    /// </summary>
    [DataContract(Name = "mod_workshop_evaluate_submission_request")]
    public partial class ModWorkshopEvaluateSubmissionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopEvaluateSubmissionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWorkshopEvaluateSubmissionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopEvaluateSubmissionRequest" /> class.
        /// </summary>
        /// <param name="feedbackformat">The feedback format for text. (default to 0).</param>
        /// <param name="feedbacktext">The feedback for the author. (default to &quot;&quot;).</param>
        /// <param name="gradeover">The new submission grade. (default to &quot;&quot;).</param>
        /// <param name="published">Publish the submission for others?. (default to false).</param>
        /// <param name="submissionid">submission id. (required) (default to null).</param>
        public ModWorkshopEvaluateSubmissionRequest(int feedbackformat = 0, string feedbacktext = @"", string gradeover = @"", bool published = false, int submissionid = null)
        {
            this.Submissionid = submissionid;
            this.Feedbackformat = feedbackformat;
            // use default value if no "feedbacktext" provided
            this.Feedbacktext = feedbacktext ?? @"";
            // use default value if no "gradeover" provided
            this.Gradeover = gradeover ?? @"";
            this.Published = published;
        }

        /// <summary>
        /// The feedback format for text.
        /// </summary>
        /// <value>The feedback format for text.</value>
        [DataMember(Name = "feedbackformat", EmitDefaultValue = false)]
        public int Feedbackformat { get; set; }

        /// <summary>
        /// The feedback for the author.
        /// </summary>
        /// <value>The feedback for the author.</value>
        [DataMember(Name = "feedbacktext", EmitDefaultValue = false)]
        public string Feedbacktext { get; set; }

        /// <summary>
        /// The new submission grade.
        /// </summary>
        /// <value>The new submission grade.</value>
        [DataMember(Name = "gradeover", EmitDefaultValue = false)]
        public string Gradeover { get; set; }

        /// <summary>
        /// Publish the submission for others?.
        /// </summary>
        /// <value>Publish the submission for others?.</value>
        [DataMember(Name = "published", EmitDefaultValue = true)]
        public bool Published { get; set; }

        /// <summary>
        /// submission id.
        /// </summary>
        /// <value>submission id.</value>
        [DataMember(Name = "submissionid", IsRequired = true, EmitDefaultValue = true)]
        public int Submissionid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopEvaluateSubmissionRequest {\n");
            sb.Append("  Feedbackformat: ").Append(Feedbackformat).Append("\n");
            sb.Append("  Feedbacktext: ").Append(Feedbacktext).Append("\n");
            sb.Append("  Gradeover: ").Append(Gradeover).Append("\n");
            sb.Append("  Published: ").Append(Published).Append("\n");
            sb.Append("  Submissionid: ").Append(Submissionid).Append("\n");
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