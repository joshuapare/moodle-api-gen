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
    /// ModLessonGetUserAttemptGrade200ResponseGrade
    /// </summary>
    [DataContract(Name = "mod_lesson_get_user_attempt_grade_200_response_grade")]
    public partial class ModLessonGetUserAttemptGrade200ResponseGrade : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetUserAttemptGrade200ResponseGrade" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLessonGetUserAttemptGrade200ResponseGrade() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetUserAttemptGrade200ResponseGrade" /> class.
        /// </summary>
        /// <param name="attempts">Number of question attempts (required).</param>
        /// <param name="earned">Points earned by student (required).</param>
        /// <param name="grade">Calculated percentage grade (required).</param>
        /// <param name="manualpoints">Point value for manually graded questions (required).</param>
        /// <param name="nmanual">Number of manually graded questions (required).</param>
        /// <param name="nquestions">Number of questions answered (required).</param>
        /// <param name="total">Max points possible (required).</param>
        public ModLessonGetUserAttemptGrade200ResponseGrade(int attempts = default(int), decimal earned = default(decimal), decimal grade = default(decimal), decimal manualpoints = default(decimal), int nmanual = default(int), int nquestions = default(int), decimal total = default(decimal))
        {
            this.Attempts = attempts;
            this.Earned = earned;
            this.Grade = grade;
            this.Manualpoints = manualpoints;
            this.Nmanual = nmanual;
            this.Nquestions = nquestions;
            this.Total = total;
        }

        /// <summary>
        /// Number of question attempts
        /// </summary>
        /// <value>Number of question attempts</value>
        [DataMember(Name = "attempts", IsRequired = true, EmitDefaultValue = true)]
        public int Attempts { get; set; }

        /// <summary>
        /// Points earned by student
        /// </summary>
        /// <value>Points earned by student</value>
        [DataMember(Name = "earned", IsRequired = true, EmitDefaultValue = true)]
        public decimal Earned { get; set; }

        /// <summary>
        /// Calculated percentage grade
        /// </summary>
        /// <value>Calculated percentage grade</value>
        [DataMember(Name = "grade", IsRequired = true, EmitDefaultValue = true)]
        public decimal Grade { get; set; }

        /// <summary>
        /// Point value for manually graded questions
        /// </summary>
        /// <value>Point value for manually graded questions</value>
        [DataMember(Name = "manualpoints", IsRequired = true, EmitDefaultValue = true)]
        public decimal Manualpoints { get; set; }

        /// <summary>
        /// Number of manually graded questions
        /// </summary>
        /// <value>Number of manually graded questions</value>
        [DataMember(Name = "nmanual", IsRequired = true, EmitDefaultValue = true)]
        public int Nmanual { get; set; }

        /// <summary>
        /// Number of questions answered
        /// </summary>
        /// <value>Number of questions answered</value>
        [DataMember(Name = "nquestions", IsRequired = true, EmitDefaultValue = true)]
        public int Nquestions { get; set; }

        /// <summary>
        /// Max points possible
        /// </summary>
        /// <value>Max points possible</value>
        [DataMember(Name = "total", IsRequired = true, EmitDefaultValue = true)]
        public decimal Total { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonGetUserAttemptGrade200ResponseGrade {\n");
            sb.Append("  Attempts: ").Append(Attempts).Append("\n");
            sb.Append("  Earned: ").Append(Earned).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Manualpoints: ").Append(Manualpoints).Append("\n");
            sb.Append("  Nmanual: ").Append(Nmanual).Append("\n");
            sb.Append("  Nquestions: ").Append(Nquestions).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
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