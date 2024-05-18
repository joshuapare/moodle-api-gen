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
    /// CoreReportbuilderReportsGet200Response
    /// </summary>
    [DataContract(Name = "core_reportbuilder_reports_get_200_response")]
    public partial class CoreReportbuilderReportsGet200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderReportsGet200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreReportbuilderReportsGet200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderReportsGet200Response" /> class.
        /// </summary>
        /// <param name="area">area (required) (default to &quot;&quot;).</param>
        /// <param name="attributes">attributes (required).</param>
        /// <param name="cardview">cardview.</param>
        /// <param name="classes">classes (required) (default to &quot;null&quot;).</param>
        /// <param name="component">component (required) (default to &quot;&quot;).</param>
        /// <param name="conditiondata">conditiondata (required).</param>
        /// <param name="conditions">conditions.</param>
        /// <param name="contextid">contextid (required) (default to {}).</param>
        /// <param name="editmode">editmode (required) (default to null).</param>
        /// <param name="filters">filters.</param>
        /// <param name="filtersapplied">filtersapplied (required) (default to null).</param>
        /// <param name="filtersform">filtersform (required) (default to &quot;null&quot;).</param>
        /// <param name="filterspresent">filterspresent (required) (default to null).</param>
        /// <param name="id">id (required) (default to 0).</param>
        /// <param name="itemid">itemid (required) (default to 0).</param>
        /// <param name="javascript">javascript (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="settingsdata">settingsdata (required).</param>
        /// <param name="sidebarmenucards">sidebarmenucards.</param>
        /// <param name="sorting">sorting.</param>
        /// <param name="source">source (required).</param>
        /// <param name="table">table (required) (default to &quot;null&quot;).</param>
        /// <param name="timecreated">timecreated (required) (default to 0).</param>
        /// <param name="timemodified">timemodified (required) (default to 0).</param>
        /// <param name="type">type (required).</param>
        /// <param name="uniquerows">uniquerows (required) (default to false).</param>
        /// <param name="usercreated">usercreated (required) (default to {}).</param>
        /// <param name="usermodified">usermodified (required) (default to 0).</param>
        public CoreReportbuilderReportsGet200Response(string area = @"", List<CoreReportbuilderReportsGet200ResponseAttributesInner> attributes = default(List<CoreReportbuilderReportsGet200ResponseAttributesInner>), CoreReportbuilderReportsGet200ResponseCardview cardview = default(CoreReportbuilderReportsGet200ResponseCardview), string classes = @"null", string component = @"", string conditiondata = default(string), CoreReportbuilderConditionsDelete200Response conditions = default(CoreReportbuilderConditionsDelete200Response), int contextid = {}, bool editmode = null, CoreReportbuilderFiltersDelete200Response filters = default(CoreReportbuilderFiltersDelete200Response), int filtersapplied = null, string filtersform = @"null", bool filterspresent = null, int id = 0, int itemid = 0, string javascript = default(string), string name = default(string), string settingsdata = default(string), CoreReportbuilderReportsGet200ResponseSidebarmenucards sidebarmenucards = default(CoreReportbuilderReportsGet200ResponseSidebarmenucards), CoreReportbuilderColumnsDelete200Response sorting = default(CoreReportbuilderColumnsDelete200Response), string source = default(string), string table = @"null", int timecreated = 0, int timemodified = 0, int type = default(int), bool uniquerows = false, int usercreated = {}, int usermodified = 0)
        {
            // to ensure "area" is required (not null)
            if (area == null)
            {
                throw new ArgumentNullException("area is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Area = area;
            // to ensure "attributes" is required (not null)
            if (attributes == null)
            {
                throw new ArgumentNullException("attributes is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Attributes = attributes;
            // to ensure "classes" is required (not null)
            if (classes == null)
            {
                throw new ArgumentNullException("classes is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Classes = classes;
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Component = component;
            // to ensure "conditiondata" is required (not null)
            if (conditiondata == null)
            {
                throw new ArgumentNullException("conditiondata is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Conditiondata = conditiondata;
            this.Contextid = contextid;
            this.Editmode = editmode;
            this.Filtersapplied = filtersapplied;
            // to ensure "filtersform" is required (not null)
            if (filtersform == null)
            {
                throw new ArgumentNullException("filtersform is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Filtersform = filtersform;
            this.Filterspresent = filterspresent;
            this.Id = id;
            this.Itemid = itemid;
            // to ensure "javascript" is required (not null)
            if (javascript == null)
            {
                throw new ArgumentNullException("javascript is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Javascript = javascript;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Name = name;
            // to ensure "settingsdata" is required (not null)
            if (settingsdata == null)
            {
                throw new ArgumentNullException("settingsdata is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Settingsdata = settingsdata;
            // to ensure "source" is required (not null)
            if (source == null)
            {
                throw new ArgumentNullException("source is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Source = source;
            // to ensure "table" is required (not null)
            if (table == null)
            {
                throw new ArgumentNullException("table is a required property for CoreReportbuilderReportsGet200Response and cannot be null");
            }
            this.Table = table;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Type = type;
            this.Uniquerows = uniquerows;
            this.Usercreated = usercreated;
            this.Usermodified = usermodified;
            this.Cardview = cardview;
            this.Conditions = conditions;
            this.Filters = filters;
            this.Sidebarmenucards = sidebarmenucards;
            this.Sorting = sorting;
        }

        /// <summary>
        /// area
        /// </summary>
        /// <value>area</value>
        [DataMember(Name = "area", IsRequired = true, EmitDefaultValue = true)]
        public string Area { get; set; }

        /// <summary>
        /// Gets or Sets Attributes
        /// </summary>
        [DataMember(Name = "attributes", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreReportbuilderReportsGet200ResponseAttributesInner> Attributes { get; set; }

        /// <summary>
        /// Gets or Sets Cardview
        /// </summary>
        [DataMember(Name = "cardview", EmitDefaultValue = false)]
        public CoreReportbuilderReportsGet200ResponseCardview Cardview { get; set; }

        /// <summary>
        /// classes
        /// </summary>
        /// <value>classes</value>
        [DataMember(Name = "classes", IsRequired = true, EmitDefaultValue = true)]
        public string Classes { get; set; }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// conditiondata
        /// </summary>
        /// <value>conditiondata</value>
        [DataMember(Name = "conditiondata", IsRequired = true, EmitDefaultValue = true)]
        public string Conditiondata { get; set; }

        /// <summary>
        /// Gets or Sets Conditions
        /// </summary>
        [DataMember(Name = "conditions", EmitDefaultValue = false)]
        public CoreReportbuilderConditionsDelete200Response Conditions { get; set; }

        /// <summary>
        /// contextid
        /// </summary>
        /// <value>contextid</value>
        [DataMember(Name = "contextid", IsRequired = true, EmitDefaultValue = true)]
        public int Contextid { get; set; }

        /// <summary>
        /// editmode
        /// </summary>
        /// <value>editmode</value>
        [DataMember(Name = "editmode", IsRequired = true, EmitDefaultValue = true)]
        public bool Editmode { get; set; }

        /// <summary>
        /// Gets or Sets Filters
        /// </summary>
        [DataMember(Name = "filters", EmitDefaultValue = false)]
        public CoreReportbuilderFiltersDelete200Response Filters { get; set; }

        /// <summary>
        /// filtersapplied
        /// </summary>
        /// <value>filtersapplied</value>
        [DataMember(Name = "filtersapplied", IsRequired = true, EmitDefaultValue = true)]
        public int Filtersapplied { get; set; }

        /// <summary>
        /// filtersform
        /// </summary>
        /// <value>filtersform</value>
        [DataMember(Name = "filtersform", IsRequired = true, EmitDefaultValue = true)]
        public string Filtersform { get; set; }

        /// <summary>
        /// filterspresent
        /// </summary>
        /// <value>filterspresent</value>
        [DataMember(Name = "filterspresent", IsRequired = true, EmitDefaultValue = true)]
        public bool Filterspresent { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// itemid
        /// </summary>
        /// <value>itemid</value>
        [DataMember(Name = "itemid", IsRequired = true, EmitDefaultValue = true)]
        public int Itemid { get; set; }

        /// <summary>
        /// javascript
        /// </summary>
        /// <value>javascript</value>
        [DataMember(Name = "javascript", IsRequired = true, EmitDefaultValue = true)]
        public string Javascript { get; set; }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// settingsdata
        /// </summary>
        /// <value>settingsdata</value>
        [DataMember(Name = "settingsdata", IsRequired = true, EmitDefaultValue = true)]
        public string Settingsdata { get; set; }

        /// <summary>
        /// Gets or Sets Sidebarmenucards
        /// </summary>
        [DataMember(Name = "sidebarmenucards", EmitDefaultValue = false)]
        public CoreReportbuilderReportsGet200ResponseSidebarmenucards Sidebarmenucards { get; set; }

        /// <summary>
        /// Gets or Sets Sorting
        /// </summary>
        [DataMember(Name = "sorting", EmitDefaultValue = false)]
        public CoreReportbuilderColumnsDelete200Response Sorting { get; set; }

        /// <summary>
        /// source
        /// </summary>
        /// <value>source</value>
        [DataMember(Name = "source", IsRequired = true, EmitDefaultValue = true)]
        public string Source { get; set; }

        /// <summary>
        /// table
        /// </summary>
        /// <value>table</value>
        [DataMember(Name = "table", IsRequired = true, EmitDefaultValue = true)]
        public string Table { get; set; }

        /// <summary>
        /// timecreated
        /// </summary>
        /// <value>timecreated</value>
        [DataMember(Name = "timecreated", IsRequired = true, EmitDefaultValue = true)]
        public int Timecreated { get; set; }

        /// <summary>
        /// timemodified
        /// </summary>
        /// <value>timemodified</value>
        [DataMember(Name = "timemodified", IsRequired = true, EmitDefaultValue = true)]
        public int Timemodified { get; set; }

        /// <summary>
        /// type
        /// </summary>
        /// <value>type</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public int Type { get; set; }

        /// <summary>
        /// uniquerows
        /// </summary>
        /// <value>uniquerows</value>
        [DataMember(Name = "uniquerows", IsRequired = true, EmitDefaultValue = true)]
        public bool Uniquerows { get; set; }

        /// <summary>
        /// usercreated
        /// </summary>
        /// <value>usercreated</value>
        [DataMember(Name = "usercreated", IsRequired = true, EmitDefaultValue = true)]
        public int Usercreated { get; set; }

        /// <summary>
        /// usermodified
        /// </summary>
        /// <value>usermodified</value>
        [DataMember(Name = "usermodified", IsRequired = true, EmitDefaultValue = true)]
        public int Usermodified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreReportbuilderReportsGet200Response {\n");
            sb.Append("  Area: ").Append(Area).Append("\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Cardview: ").Append(Cardview).Append("\n");
            sb.Append("  Classes: ").Append(Classes).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Conditiondata: ").Append(Conditiondata).Append("\n");
            sb.Append("  Conditions: ").Append(Conditions).Append("\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
            sb.Append("  Editmode: ").Append(Editmode).Append("\n");
            sb.Append("  Filters: ").Append(Filters).Append("\n");
            sb.Append("  Filtersapplied: ").Append(Filtersapplied).Append("\n");
            sb.Append("  Filtersform: ").Append(Filtersform).Append("\n");
            sb.Append("  Filterspresent: ").Append(Filterspresent).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Javascript: ").Append(Javascript).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Settingsdata: ").Append(Settingsdata).Append("\n");
            sb.Append("  Sidebarmenucards: ").Append(Sidebarmenucards).Append("\n");
            sb.Append("  Sorting: ").Append(Sorting).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Table: ").Append(Table).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Uniquerows: ").Append(Uniquerows).Append("\n");
            sb.Append("  Usercreated: ").Append(Usercreated).Append("\n");
            sb.Append("  Usermodified: ").Append(Usermodified).Append("\n");
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