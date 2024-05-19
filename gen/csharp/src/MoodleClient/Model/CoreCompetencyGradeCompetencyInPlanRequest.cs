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
    /// CoreCompetencyGradeCompetencyInPlanRequest
    /// </summary>
    [DataContract(Name = "core_competency_grade_competency_in_plan_request")]
    public partial class CoreCompetencyGradeCompetencyInPlanRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyGradeCompetencyInPlanRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencyGradeCompetencyInPlanRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyGradeCompetencyInPlanRequest" /> class.
        /// </summary>
        /// <param name="competencyid">Competency id (required).</param>
        /// <param name="grade">New grade (required).</param>
        /// <param name="note">A note to attach to the evidence.</param>
        /// <param name="planid">Plan id (required) (default to null).</param>
        public CoreCompetencyGradeCompetencyInPlanRequest(int competencyid = default(int), int grade = default(int), string note = default(string), int planid = null)
        {
            this.Competencyid = competencyid;
            this.Grade = grade;
            this.Planid = planid;
            this.Note = note;
        }

        /// <summary>
        /// Competency id
        /// </summary>
        /// <value>Competency id</value>
        [DataMember(Name = "competencyid", IsRequired = true, EmitDefaultValue = true)]
        public int Competencyid { get; set; }

        /// <summary>
        /// New grade
        /// </summary>
        /// <value>New grade</value>
        [DataMember(Name = "grade", IsRequired = true, EmitDefaultValue = true)]
        public int Grade { get; set; }

        /// <summary>
        /// A note to attach to the evidence
        /// </summary>
        /// <value>A note to attach to the evidence</value>
        [DataMember(Name = "note", EmitDefaultValue = false)]
        public string Note { get; set; }

        /// <summary>
        /// Plan id
        /// </summary>
        /// <value>Plan id</value>
        [DataMember(Name = "planid", IsRequired = true, EmitDefaultValue = true)]
        public int Planid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyGradeCompetencyInPlanRequest {\n");
            sb.Append("  Competencyid: ").Append(Competencyid).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Note: ").Append(Note).Append("\n");
            sb.Append("  Planid: ").Append(Planid).Append("\n");
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