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
    /// ModQuizGetQuizFeedbackForGradeRequest
    /// </summary>
    [DataContract(Name = "mod_quiz_get_quiz_feedback_for_grade_request")]
    public partial class ModQuizGetQuizFeedbackForGradeRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetQuizFeedbackForGradeRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModQuizGetQuizFeedbackForGradeRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetQuizFeedbackForGradeRequest" /> class.
        /// </summary>
        /// <param name="grade">the grade to check (required) (default to nullM).</param>
        /// <param name="quizid">quiz instance id (required).</param>
        public ModQuizGetQuizFeedbackForGradeRequest(decimal grade = nullM, int quizid = default(int))
        {
            this.Grade = grade;
            this.Quizid = quizid;
        }

        /// <summary>
        /// the grade to check
        /// </summary>
        /// <value>the grade to check</value>
        [DataMember(Name = "grade", IsRequired = true, EmitDefaultValue = true)]
        public decimal Grade { get; set; }

        /// <summary>
        /// quiz instance id
        /// </summary>
        /// <value>quiz instance id</value>
        [DataMember(Name = "quizid", IsRequired = true, EmitDefaultValue = true)]
        public int Quizid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModQuizGetQuizFeedbackForGradeRequest {\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Quizid: ").Append(Quizid).Append("\n");
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