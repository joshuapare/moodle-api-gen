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
    /// CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner
    /// </summary>
    [DataContract(Name = "core_grading_get_gradingform_instances_200_response_instances_inner_guide_criteria_inner")]
    public partial class CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner" /> class.
        /// </summary>
        /// <param name="criterionid">criterion id.</param>
        /// <param name="id">filling id (default to null).</param>
        /// <param name="levelid">level id.</param>
        /// <param name="remark">remark (default to &quot;null&quot;).</param>
        /// <param name="remarkformat">remark format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to null).</param>
        /// <param name="score">maximum score.</param>
        public CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner(int criterionid = default(int), int id = null, int levelid = default(int), string remark = @"null", int remarkformat = null, decimal score = default(decimal))
        {
            this.Criterionid = criterionid;
            this.Id = id;
            this.Levelid = levelid;
            // use default value if no "remark" provided
            this.Remark = remark ?? @"null";
            this.Remarkformat = remarkformat;
            this.Score = score;
        }

        /// <summary>
        /// criterion id
        /// </summary>
        /// <value>criterion id</value>
        [DataMember(Name = "criterionid", EmitDefaultValue = false)]
        public int Criterionid { get; set; }

        /// <summary>
        /// filling id
        /// </summary>
        /// <value>filling id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// level id
        /// </summary>
        /// <value>level id</value>
        [DataMember(Name = "levelid", EmitDefaultValue = false)]
        public int Levelid { get; set; }

        /// <summary>
        /// remark
        /// </summary>
        /// <value>remark</value>
        [DataMember(Name = "remark", EmitDefaultValue = false)]
        public string Remark { get; set; }

        /// <summary>
        /// remark format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>remark format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "remarkformat", EmitDefaultValue = false)]
        public int Remarkformat { get; set; }

        /// <summary>
        /// maximum score
        /// </summary>
        /// <value>maximum score</value>
        [DataMember(Name = "score", EmitDefaultValue = false)]
        public decimal Score { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner {\n");
            sb.Append("  Criterionid: ").Append(Criterionid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Levelid: ").Append(Levelid).Append("\n");
            sb.Append("  Remark: ").Append(Remark).Append("\n");
            sb.Append("  Remarkformat: ").Append(Remarkformat).Append("\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
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
