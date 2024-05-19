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
    /// ModWorkshopEvaluateAssessmentRequest
    /// </summary>
    [DataContract(Name = "mod_workshop_evaluate_assessment_request")]
    public partial class ModWorkshopEvaluateAssessmentRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopEvaluateAssessmentRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWorkshopEvaluateAssessmentRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopEvaluateAssessmentRequest" /> class.
        /// </summary>
        /// <param name="assessmentid">Assessment id. (required) (default to null).</param>
        /// <param name="feedbackformat">The feedback format for text. (default to 0).</param>
        /// <param name="feedbacktext">The feedback for the reviewer. (default to &quot;&quot;).</param>
        /// <param name="gradinggradeover">The new grading grade. (default to &quot;&quot;).</param>
        /// <param name="weight">The new weight for the assessment. (default to 1).</param>
        public ModWorkshopEvaluateAssessmentRequest(int assessmentid = null, int feedbackformat = 0, string feedbacktext = @"", string gradinggradeover = @"", int weight = 1)
        {
            this.Assessmentid = assessmentid;
            this.Feedbackformat = feedbackformat;
            // use default value if no "feedbacktext" provided
            this.Feedbacktext = feedbacktext ?? @"";
            // use default value if no "gradinggradeover" provided
            this.Gradinggradeover = gradinggradeover ?? @"";
            this.Weight = weight;
        }

        /// <summary>
        /// Assessment id.
        /// </summary>
        /// <value>Assessment id.</value>
        [DataMember(Name = "assessmentid", IsRequired = true, EmitDefaultValue = true)]
        public int Assessmentid { get; set; }

        /// <summary>
        /// The feedback format for text.
        /// </summary>
        /// <value>The feedback format for text.</value>
        [DataMember(Name = "feedbackformat", EmitDefaultValue = false)]
        public int Feedbackformat { get; set; }

        /// <summary>
        /// The feedback for the reviewer.
        /// </summary>
        /// <value>The feedback for the reviewer.</value>
        [DataMember(Name = "feedbacktext", EmitDefaultValue = false)]
        public string Feedbacktext { get; set; }

        /// <summary>
        /// The new grading grade.
        /// </summary>
        /// <value>The new grading grade.</value>
        [DataMember(Name = "gradinggradeover", EmitDefaultValue = false)]
        public string Gradinggradeover { get; set; }

        /// <summary>
        /// The new weight for the assessment.
        /// </summary>
        /// <value>The new weight for the assessment.</value>
        [DataMember(Name = "weight", EmitDefaultValue = false)]
        public int Weight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopEvaluateAssessmentRequest {\n");
            sb.Append("  Assessmentid: ").Append(Assessmentid).Append("\n");
            sb.Append("  Feedbackformat: ").Append(Feedbackformat).Append("\n");
            sb.Append("  Feedbacktext: ").Append(Feedbacktext).Append("\n");
            sb.Append("  Gradinggradeover: ").Append(Gradinggradeover).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
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
