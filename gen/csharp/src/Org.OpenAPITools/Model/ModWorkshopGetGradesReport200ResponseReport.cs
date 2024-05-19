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
    /// ModWorkshopGetGradesReport200ResponseReport
    /// </summary>
    [DataContract(Name = "mod_workshop_get_grades_report_200_response_report")]
    public partial class ModWorkshopGetGradesReport200ResponseReport : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetGradesReport200ResponseReport" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWorkshopGetGradesReport200ResponseReport() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetGradesReport200ResponseReport" /> class.
        /// </summary>
        /// <param name="grades">grades (required).</param>
        /// <param name="totalcount">Number of total submissions. (required) (default to null).</param>
        public ModWorkshopGetGradesReport200ResponseReport(List<ModWorkshopGetGradesReport200ResponseReportGradesInner> grades = default(List<ModWorkshopGetGradesReport200ResponseReportGradesInner>), int totalcount = null)
        {
            // to ensure "grades" is required (not null)
            if (grades == null)
            {
                throw new ArgumentNullException("grades is a required property for ModWorkshopGetGradesReport200ResponseReport and cannot be null");
            }
            this.Grades = grades;
            this.Totalcount = totalcount;
        }

        /// <summary>
        /// Gets or Sets Grades
        /// </summary>
        [DataMember(Name = "grades", IsRequired = true, EmitDefaultValue = true)]
        public List<ModWorkshopGetGradesReport200ResponseReportGradesInner> Grades { get; set; }

        /// <summary>
        /// Number of total submissions.
        /// </summary>
        /// <value>Number of total submissions.</value>
        [DataMember(Name = "totalcount", IsRequired = true, EmitDefaultValue = true)]
        public int Totalcount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopGetGradesReport200ResponseReport {\n");
            sb.Append("  Grades: ").Append(Grades).Append("\n");
            sb.Append("  Totalcount: ").Append(Totalcount).Append("\n");
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
