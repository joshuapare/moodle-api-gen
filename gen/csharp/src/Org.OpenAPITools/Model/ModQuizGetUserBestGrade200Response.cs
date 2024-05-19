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
    /// ModQuizGetUserBestGrade200Response
    /// </summary>
    [DataContract(Name = "mod_quiz_get_user_best_grade_200_response")]
    public partial class ModQuizGetUserBestGrade200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetUserBestGrade200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModQuizGetUserBestGrade200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetUserBestGrade200Response" /> class.
        /// </summary>
        /// <param name="grade">The grade (only if the user has a grade). (default to nullM).</param>
        /// <param name="gradetopass">The grade to pass the quiz (only if set). (default to nullM).</param>
        /// <param name="hasgrade">Whether the user has a grade on the given quiz. (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public ModQuizGetUserBestGrade200Response(decimal grade = nullM, decimal gradetopass = nullM, bool hasgrade = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Hasgrade = hasgrade;
            this.Grade = grade;
            this.Gradetopass = gradetopass;
            this.Warnings = warnings;
        }

        /// <summary>
        /// The grade (only if the user has a grade).
        /// </summary>
        /// <value>The grade (only if the user has a grade).</value>
        [DataMember(Name = "grade", EmitDefaultValue = false)]
        public decimal Grade { get; set; }

        /// <summary>
        /// The grade to pass the quiz (only if set).
        /// </summary>
        /// <value>The grade to pass the quiz (only if set).</value>
        [DataMember(Name = "gradetopass", EmitDefaultValue = false)]
        public decimal Gradetopass { get; set; }

        /// <summary>
        /// Whether the user has a grade on the given quiz.
        /// </summary>
        /// <value>Whether the user has a grade on the given quiz.</value>
        [DataMember(Name = "hasgrade", IsRequired = true, EmitDefaultValue = true)]
        public bool Hasgrade { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModQuizGetUserBestGrade200Response {\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Gradetopass: ").Append(Gradetopass).Append("\n");
            sb.Append("  Hasgrade: ").Append(Hasgrade).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
